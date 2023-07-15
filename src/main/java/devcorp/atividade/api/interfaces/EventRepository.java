package devcorp.atividade.api.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import devcorp.atividade.api.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
