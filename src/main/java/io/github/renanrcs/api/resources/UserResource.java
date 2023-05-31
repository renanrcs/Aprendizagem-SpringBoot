package io.github.renanrcs.api.resources;

import io.github.renanrcs.api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Joana", "joana@gmail.com", "3336-0001", "123");
        return ResponseEntity.ok().body(user);
    }

}
