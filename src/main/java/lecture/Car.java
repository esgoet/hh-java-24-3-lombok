package lecture;

import lombok.Builder;
import lombok.With;

@With
@Builder
public record Car(
        String name,
        int year,
        int wheels,
        int seats
) {
}
