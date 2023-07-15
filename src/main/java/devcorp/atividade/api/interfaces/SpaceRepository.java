package devcorp.atividade.api.interfaces;

import devcorp.atividade.api.entity.Space;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpaceRepository extends JpaRepository<Space, Long> {
}
