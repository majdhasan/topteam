package life.majd.backend.domain.model;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

  @Id
  private Long id;
  private String firstName;
  private String lastName;
  private String currentCity;

}
