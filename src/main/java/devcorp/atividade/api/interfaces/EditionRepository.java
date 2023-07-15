package devcorp.atividade.api.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import devcorp.atividade.api.entity.Edition;

public interface EditionRepository extends JpaRepository<Edition, Long> {
}
