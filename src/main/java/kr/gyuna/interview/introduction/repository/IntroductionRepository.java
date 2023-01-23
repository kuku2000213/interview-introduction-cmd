package kr.gyuna.interview.introduction.repository;

import kr.gyuna.interview.introduction.domain.Introduction;
import kr.gyuna.interview.introduction.domain.IntroductionId;
import org.springframework.data.repository.CrudRepository;

public interface IntroductionRepository extends CrudRepository<Introduction, IntroductionId> {
}
