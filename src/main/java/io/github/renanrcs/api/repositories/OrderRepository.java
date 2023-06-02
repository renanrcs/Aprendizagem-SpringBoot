package io.github.renanrcs.api.repositories;

import io.github.renanrcs.api.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
