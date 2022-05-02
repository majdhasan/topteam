package life.majd.backend.domain.service;

import java.util.Optional;
import java.util.Set;
import life.majd.backend.domain.model.EventLocation;
import life.majd.backend.domain.model.Person;

public interface LocationService {

  Optional<EventLocation> getEventLocation(Long id);

  Set<EventLocation> getEventLocations(String city);

  Set<EventLocation> getEventLocations(Person person);


  void createLocation(EventLocation location);

  void deleteLocation(EventLocation location);

  void updateLocation(EventLocation location);


}
