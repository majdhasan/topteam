package life.majd.backend.domain.model;

import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Event {

  private Long id;
  private LocalDateTime createdAt;
  private LocalDateTime startsAt;
  private EventLocation location;
  private TeamSize teamSize;
  private Set<Person> team1;
  private Set<Person> team2;
}
