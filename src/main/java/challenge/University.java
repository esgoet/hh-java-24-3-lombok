package challenge;

import lombok.Builder;
import lombok.Singular;
import lombok.With;

import java.util.List;

@Builder
@With
public record University(
        String id,
        String name,
        @Singular List<Course> courses
) {
}
