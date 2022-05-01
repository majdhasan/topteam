package life.majd.backend.repository.postgres.mappers;

import life.majd.backend.domain.model.Event;
import life.majd.backend.repository.postgres.entity.EventEntity;
import org.mapstruct.Mapper;

@Mapper
public interface EventMapper {

  EventEntity eventEntityToModel(Event event);

  Event eventModelToEntity(EventEntity event);

}
