package kr.gyuna.interview.introduction.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@NoArgsConstructor
@Embeddable
public class IntroductionId implements Serializable {

    private String introductionUuid;

    public IntroductionId(String introductionUuid) {
        if (introductionUuid == null) {
            throw new IllegalArgumentException("intruductionUuid is null");
        }

        this.introductionUuid = introductionUuid;
    }


    @Override
    public int hashCode() {
        return Objects.hash(introductionUuid);
    }

    public static IntroductionId of(String introductionUuid) {
        return new IntroductionId(introductionUuid);
    }

    public static IntroductionId uuid(){
        return new IntroductionId(UUID.randomUUID().toString());
    }

    public String showId(){
        return this.introductionUuid;
    }
}
