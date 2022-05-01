package life.majd.backend.repository.postgres.mappers;

import life.majd.backend.domain.model.EventLocation;
import life.majd.backend.repository.postgres.entity.EventLocationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EventLocationMapper {

  EventLocationMapper INSTANCE = Mappers.getMapper(EventLocationMapper.class);

  EventLocation EventLocationEntityToModel(EventLocationEntity location);

  EventLocationEntity EventLocationModelToEntity(EventLocation location);
}
