package life.majd.backend.repository.postgres;

import life.majd.backend.repository.postgres.entity.EventLocationEntity;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventLocationRepository extends JpaRepository<EventLocationEntity, Long> {

  Set<EventLocationEntity> findEventLocationEntitiesByAddressCity(String city);

}
