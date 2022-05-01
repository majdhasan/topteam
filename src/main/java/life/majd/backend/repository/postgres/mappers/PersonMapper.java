package life.majd.backend.repository.postgres.mappers;

import life.majd.backend.domain.model.Person;
import life.majd.backend.repository.postgres.entity.PersonEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

  Person personEntityToModel(PersonEntity person);

  PersonEntity personModelToEntity(Person person);

}
