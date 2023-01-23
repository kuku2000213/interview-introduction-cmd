package kr.gyuna.interview.introduction.domain;

import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@NoArgsConstructor
@Embeddable
public class UserId  implements Serializable {

    private String userUuid;

    public UserId(String userUuid) {
        if (userUuid == null) {
            throw new IllegalArgumentException("intruductionUuid is null");
        }

        this.userUuid = userUuid;
    }


    @Override
    public int hashCode() {
        return Objects.hash(userUuid);
    }

    public static UserId of(String intruductionUuid) {
        return new UserId(intruductionUuid);
    }

    public static UserId uuid(){
        return new UserId(UUID.randomUUID().toString());
    }

    public String showId(){
        return this.userUuid;
    }
}
