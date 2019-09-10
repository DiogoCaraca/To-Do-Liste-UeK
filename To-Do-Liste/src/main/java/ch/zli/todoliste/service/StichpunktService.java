package ch.zli.todoliste.service;

import ch.zli.todoliste.model.Stichpunkt;
import ch.zli.todoliste.repository.StichpunktRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StichpunktService{
    private StichpunktRepository stichpunktRepository;

    public StichpunktService(StichpunktRepository stichpunktRepository) {
        this.stichpunktRepository = stichpunktRepository;
    }

    public Stichpunkt createStichpunkt(Stichpunkt stichpunkt) {
        return stichpunktRepository.save(stichpunkt);
    }

    public List<Stichpunkt> getStichpunkte() {
        return stichpunktRepository.findAll();
    }

    public Optional<Stichpunkt> getStichpunktById(Long id) {
        return stichpunktRepository.findById(id);
    }

    public Stichpunkt updateStichpunkt(Stichpunkt stichpunkt) {
        return stichpunktRepository.save(stichpunkt);
    }

    public void deleteStichpunkt(Long id) {
        stichpunktRepository.deleteById(id);
    }
}
