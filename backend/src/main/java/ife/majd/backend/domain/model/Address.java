package ife.majd.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

  private Long id;
  private String streetName;
  private String city;
  private String zipCode;
  private String country;

}
