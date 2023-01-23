package kr.gyuna.interview.introduction.event.user.application.service;

import jakarta.transaction.Transactional;
import kr.gyuna.interview.introduction.event.user.domain.Enterprise;
import kr.gyuna.interview.introduction.event.user.repository.EnterpriseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Transactional
@Service
public class EnterpriseService {

    private final EnterpriseRepository enterpriseRepository;


    public void createEnterprise(Enterprise enterprise) {
        enterpriseRepository.save(enterprise);
    }
}
