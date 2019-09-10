package ch.zli.todoliste.service;

import ch.zli.todoliste.model.Liste;
import ch.zli.todoliste.repository.ListeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListeService {
    private ListeRepository listeRepository;

    public ListeService(ListeRepository listeRepository) {
        this.listeRepository = listeRepository;
    }

    public Liste createListe(Liste liste) {
        return listeRepository.save(liste);
    }

    public List<Liste> getListen() {
        return listeRepository.findAll();
    }

    public Optional<Liste> getListeById(Long id) {
        return listeRepository.findById(id);
    }

    public Liste updateListe(Liste liste) {
        return listeRepository.save(liste);
    }

    public void deleteListe(Long id) {
        listeRepository.deleteById(id);
    }
}
