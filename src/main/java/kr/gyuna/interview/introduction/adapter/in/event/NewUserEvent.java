package kr.gyuna.interview.introduction.adapter.in.event;

import kr.gyuna.interview.introduction.event.user.domain.Enterprise;
import kr.gyuna.interview.introduction.domain.UserId;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewUserEvent {

    private String userId;
    private String userType;

    public boolean isEnterprise(){
        return userType.equals("ENTERPRISE");
    }

    public Enterprise toEnterprise(){
        return Enterprise.builder()
                .userId(UserId.of(this.userId))
                .build();
    }
}
