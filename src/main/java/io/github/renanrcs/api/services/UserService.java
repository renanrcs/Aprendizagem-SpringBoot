package io.github.renanrcs.api.services;

import io.github.renanrcs.api.entities.User;
import io.github.renanrcs.api.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.get();
    }
}
