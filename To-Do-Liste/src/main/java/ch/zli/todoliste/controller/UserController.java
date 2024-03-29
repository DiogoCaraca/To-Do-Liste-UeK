package ch.zli.todoliste.controller;

import ch.zli.todoliste.model.User;
import ch.zli.todoliste.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

//da sind user Funktionen
@RestController
@RequestMapping("api/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //erstellt einen user - registrieren
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@Valid @RequestBody User user){
        return userService.createUser(user);
    }

    //holt einen user - authentication versuch
    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> authenticationLogin(@PathVariable Long id) {
        return userService.authenticationLogin(id);
    }
}
