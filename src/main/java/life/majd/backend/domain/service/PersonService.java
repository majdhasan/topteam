package life.majd.backend.domain.service;

import life.majd.backend.domain.model.Person;
import java.util.Optional;
import java.util.Set;

public interface PersonService {

  Optional<Person> getPerson(Long id);

  void addPerson(Person person);

  void deletePerson(Person person);

  void editPerson(Person person);

  Set<Person> getFollowers(Person person);

  Set<Person> getFollowed(Person person);

  void followPerson(Person follower, Person followed);


}
