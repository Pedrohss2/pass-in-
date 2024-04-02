package phpass.com.passin.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import phpass.com.passin.domain.event.Event;
import phpass.com.passin.repository.EventRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    public void getEventDetail(String id) {
        Event eventId = eventRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Event not found with id: " + id)
        );
        return;
    }

}
