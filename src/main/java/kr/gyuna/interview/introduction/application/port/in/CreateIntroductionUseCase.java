package kr.gyuna.interview.introduction.application.port.in;

import kr.gyuna.interview.common.response.DefaultResponse;

public interface CreateIntroductionUseCase {

    DefaultResponse createIntroduction(CreateIntroductionCommand command);
}
