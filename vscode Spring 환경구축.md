### 1. pom.xml

```xml
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web-services</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>org.junit.vintage</groupId>
					<artifactId>junit-vintage-engine</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		<!-- jsp 설정 -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
		</dependency>
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
		</dependency>
		
		<!-- DB 설정 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
		</dependency>
		<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>1.3.0</version>
		</dependency>


	</dependencies>
```

### 2. Application.properties

```properties
# Web ContextRootPath and PortNumber Settings
server.servlet.context-path=/blackstone
server.port=8080

# JSP Path (ViewResolver)
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp

# DataBase
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/blackstone?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=rootroot

#mapper location settings
mybatis.config-location=classpath:config/mybatis-config.xml


```

### 3. Mybatis-config.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN" "http://mybatis.org/dtd/mybatis-3-config.dtd" >
<configuration>
 <!-- mybatis-config.xml -->
 	<typeAliases>
       <package name="com.jinhyang.blackstone.dto"/>
    </typeAliases>
   	<mappers>
   		<mapper resource="mappers/Board.xml"/>		
   		<mapper resource="mappers/Comment.xml"/>		
   		<mapper resource="mappers/Commentp.xml"/>		
   		<mapper resource="mappers/Cost.xml"/>		
   		<mapper resource="mappers/Diary.xml"/>		
   		<mapper resource="mappers/PhotoBook.xml"/>		
   		<mapper resource="mappers/Todolist.xml"/>		
    	<mapper resource="mappers/User.xml"/>		
   	</mappers>
</configuration>

```

