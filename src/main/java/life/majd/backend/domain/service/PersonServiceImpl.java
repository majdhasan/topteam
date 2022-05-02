package life.majd.backend.domain.service;

import java.util.Optional;
import java.util.Set;
import life.majd.backend.domain.model.Person;
import life.majd.backend.repository.postgres.PersonRepository;
import life.majd.backend.repository.postgres.entity.PersonEntity;
import life.majd.backend.repository.postgres.mappers.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

  private PersonMapper personMapper;
  private PersonRepository personRepository;

  @Override
  public Optional<Person> getPerson(Long id) {

    return Optional.empty();
  }

  @Override
  public void addPerson(Person person) {

    PersonEntity personEntity = personMapper.personModelToEntity(person);
    personRepository.save(personEntity);
  }

  @Override
  public void deletePerson(Person person) {

  }

  @Override
  public void editPerson(Person person) {

  }

  @Override
  public Set<Person> getFollowers(Person person) {
    return null;
  }

  @Override
  public Set<Person> getFollowed(Person person) {
    return null;
  }

  @Override
  public void followPerson(Person follower, Person followed) {

  }
}
