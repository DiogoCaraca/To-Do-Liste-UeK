package ch.zli.todoliste.controller;

import ch.zli.todoliste.model.Stichpunkt;
import ch.zli.todoliste.service.StichpunktService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/stichpunkt")
public class StichpunktController {
    private StichpunktService stichpunktService;

    public StichpunktController(StichpunktService stichpunktService) {
        this.stichpunktService = stichpunktService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Stichpunkt createStichpunkt(@Valid @RequestBody Stichpunkt stichpunkt) {
        return stichpunktService.createStichpunkt(stichpunkt);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Stichpunkt> getStichpunkte() {
        return stichpunktService.getStichpunkte();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Stichpunkt> getStichpunktById(@PathVariable Long id) {
        return stichpunktService.getStichpunktById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Stichpunkt upadteStichpunkt(@Valid @RequestBody Stichpunkt stichpunkt) {
        return stichpunktService.updateStichpunkt(stichpunkt);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStichpunkt(@PathVariable Long id) {
        stichpunktService.deleteStichpunkt(id);
    }
}
