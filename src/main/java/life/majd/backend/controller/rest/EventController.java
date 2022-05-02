package life.majd.backend.controller.rest;

import life.majd.backend.domain.model.Event;
import life.majd.backend.domain.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/event")
@RequiredArgsConstructor
public class EventController {

  EventService eventService;

  @PostMapping()
  ResponseEntity<Event> createEvent(Event event) {
    eventService.createEvent(event);
    return new ResponseEntity<>(event, HttpStatus.ACCEPTED);
  }
}
