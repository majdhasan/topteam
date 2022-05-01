package life.majd.backend.repository.postgres.entity;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "event")
public class EventEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "organizer_id", nullable = false, insertable = false, updatable = false)
  private PersonEntity organizer;

  @ManyToOne
  @JoinColumn(name = "organizer_id")
  private PersonEntity coOrganizer;


  @Column(name = "created_at", nullable = false)
  private LocalDateTime createdAt;

  @Column(name = "starts_at", nullable = false)
  private LocalDateTime startsAt;

  @ManyToOne
  @JoinColumn(name = "location_id", nullable = false)
  private EventLocationEntity location;

  @Column(name = "event_type", nullable = false)
  private String eventType;

  @Column(name = "team_size", nullable = false)
  private int teamSize;

  @Column(name = "event_status", nullable = false)
  private String eventStatus;

  @ManyToMany
  private Set<PersonEntity> team1;

  @ManyToMany
  private Set<PersonEntity> team2;

  @Column(name = "cancellation_deadline")
  private int cancellationDeadline;
}
