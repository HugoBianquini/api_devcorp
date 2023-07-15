package devcorp.atividade.api.interfaces;
import org.springframework.data.jpa.repository.JpaRepository;
import devcorp.atividade.api.entity.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
