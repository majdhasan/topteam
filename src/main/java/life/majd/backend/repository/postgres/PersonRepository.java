package life.majd.backend.repository.postgres;

import life.majd.backend.repository.postgres.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {


}
