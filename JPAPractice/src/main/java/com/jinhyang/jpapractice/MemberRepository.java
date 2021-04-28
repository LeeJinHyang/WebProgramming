package com.jinhyang.jpapractice;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;
    /**
     * command와 Query를 분리해라
     * */
    public Long save(Member member){
        em.persist(member);
        return member.getId();
    }

    public Member getMember(Long id){
        return em.find(Member.class, id);
    }
}
