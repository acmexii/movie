package movie.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import movie.domain.*;
import movie.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ImRunningOutOfPoints extends AbstractEvent {

    private Long id;

    public ImRunningOutOfPoints(Point aggregate) {
        super(aggregate);
    }

    public ImRunningOutOfPoints() {
        super();
    }
}
//>>> DDD / Domain Event
