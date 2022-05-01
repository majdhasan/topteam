package life.majd.backend.repository.postgres;

import life.majd.backend.repository.postgres.entity.EventEntity;
import life.majd.backend.repository.postgres.entity.EventLocationEntity;
import life.majd.backend.repository.postgres.entity.PersonEntity;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {

  Set<EventEntity> findAllByOrganizer(PersonEntity person);
  Set<EventEntity> findAllByLocation(EventLocationEntity location);


}
