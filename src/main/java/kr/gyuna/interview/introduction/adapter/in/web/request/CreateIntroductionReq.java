package kr.gyuna.interview.introduction.adapter.in.web.request;

import kr.gyuna.interview.introduction.domain.UserId;
import lombok.Getter;

@Getter
public class CreateIntroductionReq {

    private String userId;
    private String companyName;
    private String content;
}
