package kr.gyuna.interview.introduction.application.port.in;

import kr.gyuna.interview.introduction.domain.Introduction;
import kr.gyuna.interview.introduction.domain.IntroductionDetail;
import kr.gyuna.interview.introduction.domain.IntroductionId;
import kr.gyuna.interview.introduction.domain.UserId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateIntroductionCommand {

    private UserId userId;
    private String companyName;
    private String introductionContent;

    public Introduction toEntity(){
        IntroductionDetail introductionDetail = IntroductionDetail.builder()
                .companyName(this.companyName)
                .introductionContent(this.introductionContent)
                .build();

        return Introduction.builder()
                .introductionId(IntroductionId.uuid())
                .userId(this.userId)
                .introductionDetail(introductionDetail)
                .build();
    }

    public UserId getUserId(){
        return this.userId;
    }
}
