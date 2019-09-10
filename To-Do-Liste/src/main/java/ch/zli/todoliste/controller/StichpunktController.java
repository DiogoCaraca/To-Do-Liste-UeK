package ch.zli.todoliste.controller;

import ch.zli.todoliste.model.Stichpunkt;
import ch.zli.todoliste.service.StichpunktService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

//da sind stichpunkt Funktionen
@RestController
@RequestMapping("api/stichpunkt")
public class StichpunktController {
    private StichpunktService stichpunktService;

    public StichpunktController(StichpunktService stichpunktService) {
        this.stichpunktService = stichpunktService;
    }

    //erstellt einen stichpunkt
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Stichpunkt createStichpunkt(@Valid @RequestBody Stichpunkt stichpunkt) {
        return stichpunktService.createStichpunkt(stichpunkt);
    }

    //holt alle stichpunkte
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Stichpunkt> getStichpunkte() {
        return stichpunktService.getStichpunkte();
    }

    //holt einen stichpunkt
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Stichpunkt> getStichpunktById(@PathVariable Long id) {
        return stichpunktService.getStichpunktById(id);
    }

    //aktualisiert einen stichpunkt
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Stichpunkt upadteStichpunkt(@Valid @RequestBody Stichpunkt stichpunkt) {
        return stichpunktService.updateStichpunkt(stichpunkt);
    }

    //löscht einen stichpunkt
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStichpunkt(@PathVariable Long id) {
        stichpunktService.deleteStichpunkt(id);
    }
}
