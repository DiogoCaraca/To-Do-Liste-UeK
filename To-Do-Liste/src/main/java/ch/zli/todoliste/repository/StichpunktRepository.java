package ch.zli.todoliste.repository;

import ch.zli.todoliste.model.Stichpunkt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StichpunktRepository extends JpaRepository<Stichpunkt, Long> {
}
