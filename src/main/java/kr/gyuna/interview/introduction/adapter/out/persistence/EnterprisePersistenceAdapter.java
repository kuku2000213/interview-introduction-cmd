package kr.gyuna.interview.introduction.adapter.out.persistence;

import kr.gyuna.interview.introduction.application.port.out.FindEnterprisePort;
import kr.gyuna.interview.introduction.domain.UserId;
import kr.gyuna.interview.introduction.event.user.domain.Enterprise;
import kr.gyuna.interview.introduction.event.user.repository.EnterpriseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class EnterprisePersistenceAdapter implements FindEnterprisePort {

    private final EnterpriseRepository enterpriseRepository;

    @Override
    public Enterprise findEnterpriseById(UserId userId) {

        Optional<Enterprise> enterpriseOpt =
                enterpriseRepository.findById(userId);

        return enterpriseOpt.orElseThrow(() ->
                new NullPointerException("해당 회원이 존재하지 않거나, 기업 회원이 아닙니다.")
        );
    }
}
