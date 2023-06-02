package io.github.renanrcs.api.config;

import io.github.renanrcs.api.entities.Order;
import io.github.renanrcs.api.entities.User;
import io.github.renanrcs.api.repositories.OrderRepository;
import io.github.renanrcs.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Joana", "joana@gmail.com", "3336-0001", "123");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "999777799", "123");

        Order o1 = new Order(null, Instant.parse("2023-06-02T14:02:10Z"), user1);
        Order o2 = new Order(null, Instant.parse("2023-07-02T14:02:20Z"), user2);
        Order o3 = new Order(null, Instant.parse("2023-07-02T14:02:30Z"), user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
