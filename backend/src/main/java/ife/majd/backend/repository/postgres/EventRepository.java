package ife.majd.backend.repository.postgres;

import ife.majd.backend.repository.postgres.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long> {



}
