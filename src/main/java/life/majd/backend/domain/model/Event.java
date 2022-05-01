package life.majd.backend.domain.model;

import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Event {

  private Long id;
  private LocalDateTime createdAt;
  private LocalDateTime startsAt;
  private EventLocation location;
  private int teamSize;
  private Set<Person> team1;
  private Set<Person> team2;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(LocalDateTime startsAt) {
    this.startsAt = startsAt;
  }

  public EventLocation getLocation() {
    return location;
  }

  public void setLocation(EventLocation location) {
    this.location = location;
  }

  public int getTeamSize() {
    return teamSize;
  }

  public void setTeamSize(int teamSize) {
    this.teamSize = teamSize;
  }

  public Set<Person> getTeam1() {
    return team1;
  }

  public void setTeam1(Set<Person> team1) {
    this.team1 = team1;
  }

  public Set<Person> getTeam2() {
    return team2;
  }

  public void setTeam2(Set<Person> team2) {
    this.team2 = team2;
  }
}
