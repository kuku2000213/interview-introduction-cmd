package kr.gyuna.interview.introduction.application.port.out;

import kr.gyuna.interview.introduction.domain.Introduction;
import kr.gyuna.interview.introduction.domain.IntroductionId;

public interface CreateIntroductionPort {

    IntroductionId createIntroduction(Introduction introduction);
}
