package kr.gyuna.interview.introduction.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class IntroductionDSL {

    private final JPAQueryFactory jpaQueryFactory;

    public IntroductionDSL(
        EntityManager entityManager
    ){
        this.jpaQueryFactory = new JPAQueryFactory(entityManager);
    }
}
