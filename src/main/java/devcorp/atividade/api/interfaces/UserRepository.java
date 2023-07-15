package devcorp.atividade.api.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import devcorp.atividade.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
