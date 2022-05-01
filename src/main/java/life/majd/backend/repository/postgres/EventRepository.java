package life.majd.backend.repository.postgres;

import java.util.Set;
import life.majd.backend.repository.postgres.entity.EventEntity;
import life.majd.backend.repository.postgres.entity.EventLocationEntity;
import life.majd.backend.repository.postgres.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {

  Set<EventEntity> findEventEntitiesByOrganizer(PersonEntity person);

  Set<EventEntity> findEventEntitiesByLocation(EventLocationEntity location);

}
