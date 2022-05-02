package life.majd.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventLocation {

  private Long id;
  private String name;
  private Address address;

}
