package ife.majd.backend.repository.postgres;

import ife.majd.backend.repository.postgres.entity.EventLocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventLocationRepository extends JpaRepository<EventLocationEntity, Long> {


}
