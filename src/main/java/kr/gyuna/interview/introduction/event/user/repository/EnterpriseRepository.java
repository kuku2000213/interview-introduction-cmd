package kr.gyuna.interview.introduction.event.user.repository;

import kr.gyuna.interview.introduction.event.user.domain.Enterprise;
import kr.gyuna.interview.introduction.domain.UserId;
import org.springframework.data.repository.CrudRepository;

public interface EnterpriseRepository extends CrudRepository<Enterprise, UserId> {
}
