package kr.gyuna.interview.introduction.event.user.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import kr.gyuna.interview.introduction.domain.UserId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Enterprise {

    @EmbeddedId
    private UserId userId;
}
