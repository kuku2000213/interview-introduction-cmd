package kr.gyuna.interview.introduction.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Introduction {

    @EmbeddedId
    private IntroductionId introductionId;

    @Embedded
    private UserId userId;

    @Embedded
    private IntroductionDetail introductionDetail;
}
