package io.github.renanrcs.api.config;

import io.github.renanrcs.api.entities.Category;
import io.github.renanrcs.api.entities.Order;
import io.github.renanrcs.api.entities.User;
import io.github.renanrcs.api.entities.enums.OrderStatus;
import io.github.renanrcs.api.repositories.CategoryRepository;
import io.github.renanrcs.api.repositories.OrderRepository;
import io.github.renanrcs.api.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@AllArgsConstructor
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private UserRepository userRepository;
    private OrderRepository orderRepository;
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        User user1 = new User(null, "Joana", "joana@gmail.com", "3336-0001", "123");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "999777799", "123");

        Order o1 = new Order(null, Instant.parse("2023-06-02T14:02:10Z"), OrderStatus.PAID, user1);
        Order o2 = new Order(null, Instant.parse("2023-07-02T14:02:20Z"), OrderStatus.WAITING_PAYMENT, user2);
        Order o3 = new Order(null, Instant.parse("2023-07-02T14:02:30Z"), OrderStatus.WAITING_PAYMENT, user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
