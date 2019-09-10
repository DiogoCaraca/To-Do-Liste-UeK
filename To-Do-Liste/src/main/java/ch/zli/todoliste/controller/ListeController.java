package ch.zli.todoliste.controller;

import ch.zli.todoliste.model.Liste;
import ch.zli.todoliste.service.ListeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/liste")
public class ListeController {
    private ListeService listeService;

    public ListeController(ListeService listeService) {
        this.listeService = listeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Liste createListe(@Valid @RequestBody Liste liste) {
        return listeService.createListe(liste);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Liste> getListen() {
        return listeService.getListen();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Liste> getListeById(@PathVariable Long id) {
        return listeService.getListeById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Liste upadteListe(@Valid @RequestBody Liste liste) {
        return listeService.updateListe(liste);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteListe(@PathVariable Long id) {
        listeService.deleteListe(id);
    }
}