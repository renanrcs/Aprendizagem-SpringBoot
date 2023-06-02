package io.github.renanrcs.api.services;

import io.github.renanrcs.api.entities.Order;
import io.github.renanrcs.api.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class OrderService {

    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> userOptional = orderRepository.findById(id);
        return userOptional.get();
    }
}
