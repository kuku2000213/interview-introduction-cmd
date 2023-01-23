package kr.gyuna.interview.introduction.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class IntroductionDetail {

    private String companyName;
    private String introductionContent;
}
