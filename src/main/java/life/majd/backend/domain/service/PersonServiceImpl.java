package life.majd.backend.domain.service;

import java.util.Optional;
import java.util.Set;
import life.majd.backend.domain.model.Person;

public class PersonServiceImpl implements PersonService{

  @Override
  public Optional<Person> getPerson(Long id) {

    return Optional.empty();
  }

  @Override
  public void addPerson(Person person) {

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
