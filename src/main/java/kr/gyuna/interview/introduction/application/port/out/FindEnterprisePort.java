package kr.gyuna.interview.introduction.application.port.out;

import kr.gyuna.interview.introduction.domain.UserId;
import kr.gyuna.interview.introduction.event.user.domain.Enterprise;

public interface FindEnterprisePort {

    Enterprise findEnterpriseById(UserId userId);
}
