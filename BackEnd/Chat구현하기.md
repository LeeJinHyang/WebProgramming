# 채팅서비스 구현하기

채팅 서비스 구현을 위해서는 htt신이 아닌 Socket통신을 하는 서버가 필요하다.



##### http통신

- client 요청 발생시에만 서버가 응답하고 연결을 종료하는 단방향 통신
- -> client가 server에 접속해 콘텐츠를 요청하고 결과를 받아 소비하는 구조의 서비스에서 많이 사용



##### socket통신

- server와 client가 특정 port를 통해 지속적으로 연결유지하여 실시간으로 양방향 통신하는 방식
- 주로 채팅과 같은 실시간성을 요구하는 서비스에서 사용된다



##### WebSocket

- WebSocket은 기존의 단방향 Http 프로토콜과 호환되어 양방향 통신을 제공하기 위해 개발된 프로토콜
- 일반 Socket통신과 달리 Http 80 port를 이용하기 때문에 방화벽 제약X
- 접속까지는 Http 프로토콜을 이용하고 그 이후의 통신은 자체적인 WebSocket 프로토콜로 통신하게 된다







#### 1. SpringBoot WebSocket 서버 구축

#### 2. pom.xml에 라이브러리 추가

```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.0.1</version>
    <scope>provided</scope>
</dependency>
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>
<!-- websocket -->
<dependency>
    <groupId>javax.websocket</groupId>
    <artifactId>javax.websocket-api</artifactId>
    <version>1.0</version>
    <scope>provided</scope>
</dependency>
<!-- spring-websocket -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-websocket</artifactId>
    <version>4.0.4.RELEASE</version>
</dependency>
```



#### 3. application 설정

```java
package com.hometudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
```



#### 4. WebSocket Handler 작성

##### 	handler 

- socket 통신은 서버와 클라이언트가 1:N의 관계를 맺는다

- 한 서버에 여러 클라이언트가 접속할 수 있으며, 서버에는 여러 클라이언트가 발송한 메시지를 받아 처리해줄 Handler의 작성이 필요하다

- TextWebSocketHandler를 상속받아 Handler를 작성해준다.

- Client로부터 받은 메시지를 Console Log에 출력하고 Client로 환영 메시지를 보내는 역할을 한다.

  ```java
  package com.websocket.chat.handler;
  
  // import 생략....
  
  @Slf4j
  @Component
  public class WebSockChatHandler extends TextWebSocketHandler {
  
      @Override
      protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
          String payload = message.getPayload();
          log.info("payload {}", payload);
          TextMessage textMessage = new TextMessage("Welcome chatting sever~^^");
          session.sendMessage(textMessage);
      }
  }
  ```

  

#### 5. WebSocket config 작성

- hangler를 이용하여 WebSocket를 활성화하기 위한 Config파일을 작성한다
- @EnableWebSocket을 선언하여 WebSocket을 활성화한다
- WebSocket에 접속하기 위한 endPoint는 /ws/chat으로 설정하고 도메인이 다른 서버에서도 접속 가능하도록 CORS:setAllowedOrigins("*")를 설정 추가해준다
- 이제 클라이언트가 ws://localhost:8080/ws/chat 으로 커넥션을 연결하고 메시지 통신이 가능해진다

```java
@RequiredArgsConstructor
@Configuration
@EnableWebSocket
public class WebSockConfig implements WebSocketConfigurer {
    private final WebSocketHandler webSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketHandler, "").setAllowedOrigins("*");
    }
}
```

