package ch.zli.todoliste.service;

import ch.zli.todoliste.model.User;
import ch.zli.todoliste.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> authenticationLogin(Long id) {
        return userRepository.findById(id);
    }
}
