package kr.gyuna.interview.introduction.application.service;


import kr.gyuna.interview.common.response.DefaultResponse;
import kr.gyuna.interview.introduction.application.port.in.CreateIntroductionCommand;
import kr.gyuna.interview.introduction.application.port.in.CreateIntroductionUseCase;
import kr.gyuna.interview.introduction.application.port.out.CreateIntroductionPort;
import kr.gyuna.interview.introduction.application.port.out.FindEnterprisePort;
import kr.gyuna.interview.introduction.domain.IntroductionId;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class CreateIntroductionService implements CreateIntroductionUseCase {

    private final CreateIntroductionPort createIntroductionPort;
    private final FindEnterprisePort findEnterprisePort;

    @Override
    public DefaultResponse createIntroduction(CreateIntroductionCommand command) {

        findEnterprisePort.findEnterpriseById(command.getUserId());

        IntroductionId introductionId =
                createIntroductionPort.createIntroduction(command.toEntity());

        return new DefaultResponse(
                HttpStatus.CREATED.value(),
                "회사소개가 정상적으로 등록되었습니다.",
                introductionId.showId()
        );
    }
}
