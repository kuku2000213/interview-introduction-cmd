package kr.gyuna.interview.introduction.adapter.out.persistence;

import kr.gyuna.interview.introduction.application.port.out.CreateIntroductionPort;
import kr.gyuna.interview.introduction.domain.Introduction;
import kr.gyuna.interview.introduction.domain.IntroductionId;
import kr.gyuna.interview.introduction.repository.IntroductionDSL;
import kr.gyuna.interview.introduction.repository.IntroductionRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class IntroductionPersistenceAdapter implements CreateIntroductionPort {

    private final IntroductionRepository introductionRepository;
    private final IntroductionDSL introductionDSL;


    @Override
    public IntroductionId createIntroduction(Introduction introduction) {

        Introduction createdIntroduction = introductionRepository.save(introduction);



        return createdIntroduction.getIntroductionId();
    }
}
