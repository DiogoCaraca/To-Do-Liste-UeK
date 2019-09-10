package ch.zli.todoliste.repository;

import ch.zli.todoliste.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
