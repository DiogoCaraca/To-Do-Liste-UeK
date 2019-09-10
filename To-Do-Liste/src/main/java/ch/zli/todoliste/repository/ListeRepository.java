package ch.zli.todoliste.repository;

import ch.zli.todoliste.model.Liste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListeRepository extends JpaRepository<Liste, Long> {
}
