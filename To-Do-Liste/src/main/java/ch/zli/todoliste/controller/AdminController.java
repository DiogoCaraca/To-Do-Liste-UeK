package ch.zli.todoliste.controller;

import ch.zli.todoliste.model.User;
import ch.zli.todoliste.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

//da sind admin Funktionen
@RestController
@RequestMapping("api/admin")
public class AdminController {
    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    //holt alle users
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return adminService.getUsers();
    }

    //holt einen user
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> getUserById(@PathVariable Long id) {
        return adminService.getUserById(id);
    }

    //aktualisiert einen user
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public User upadteUser(@Valid @RequestBody User user) {
        return adminService.updateUser(user);
    }

    //löscht einen user
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) {
        adminService.deleteUser(id);
    }
}
