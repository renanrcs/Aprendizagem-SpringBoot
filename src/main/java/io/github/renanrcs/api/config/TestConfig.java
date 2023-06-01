package io.github.renanrcs.api.config;

import io.github.renanrcs.api.entities.User;
import io.github.renanrcs.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Joana", "joana@gmail.com", "3336-0001", "123");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "999777799", "123");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
