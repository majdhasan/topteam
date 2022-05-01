package life.majd.backend.repository.postgres.mappers;

import life.majd.backend.domain.model.EventLocation;
import life.majd.backend.repository.postgres.entity.EventLocationEntity;
import org.mapstruct.Mapper;

@Mapper
public interface EventLocationMapper {

  EventLocation EventLocationEntityToModel(EventLocationEntity location);

  EventLocationEntity EventLocationModelToEntity(EventLocation location);
}
