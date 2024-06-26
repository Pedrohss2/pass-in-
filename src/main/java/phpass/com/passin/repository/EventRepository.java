package phpass.com.passin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import phpass.com.passin.domain.attendee.Attendee;
import phpass.com.passin.domain.event.Event;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, String> {
}
