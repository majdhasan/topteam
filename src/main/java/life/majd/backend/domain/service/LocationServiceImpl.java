package life.majd.backend.domain.service;

import life.majd.backend.domain.model.Event;
import life.majd.backend.domain.model.EventLocation;
import life.majd.backend.domain.model.Person;
import life.majd.backend.repository.postgres.EventLocationRepository;
import life.majd.backend.repository.postgres.EventRepository;
import life.majd.backend.repository.postgres.entity.EventLocationEntity;
import life.majd.backend.repository.postgres.mappers.EventLocationMapper;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

  private EventLocationRepository eventLocationRepository;

  private EventRepository eventRepository;

  private EventLocationMapper eventLocationMapper;

  @Override
  public Set<EventLocation> getEventLocations(String city) {

    Set<EventLocation> eventLocations = new HashSet<>();
    Set<EventLocationEntity> eventLocationEntitiesByAddressCity =
        eventLocationRepository.findEventLocationEntitiesByAddressCity(city);
    eventLocationEntitiesByAddressCity.forEach(
        eventLocationEntity -> eventLocations.add(
            eventLocationMapper.EventLocationEntityToModel(eventLocationEntity)));

    return eventLocations;
  }

  @Override
  public Optional<EventLocation> getEventLocation(Long id) {
    Optional<EventLocationEntity> locationEntity = eventLocationRepository.findById(id);
    return locationEntity.map(location -> eventLocationMapper.EventLocationEntityToModel(location));
  }

  @Override
  public Optional<EventLocation> getEventLocation(Event event) {
//    Optional<EventEntity> eventEntity = eventRepository.findOne();
//    return eventEntity.map(
//        entity -> eventLocationMapper.EventLocationEntityToModel(entity.getLocation()));
    return Optional.empty();
  }


  @Override
  public Set<EventLocation> getEventLocations(Person person) {
    return null;
  }

  @Override
  public void createLocation(EventLocation location) {

    EventLocationEntity eventLocationEntity = eventLocationMapper.EventLocationModelToEntity(
        location);
    eventLocationRepository.save(eventLocationEntity);

  }

  @Override
  public void deleteLocation(EventLocation location) {
    Optional<EventLocationEntity> locationEntity = eventLocationRepository.findById(
        location.getId());
    locationEntity.ifPresent(
        eventLocationEntity -> eventLocationRepository.delete(eventLocationEntity));
  }

  @Override
  public void updateLocation(EventLocation location) {
  }
}
