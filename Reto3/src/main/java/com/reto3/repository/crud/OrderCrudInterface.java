package com.reto3.repository.crud;

import com.reto3.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderCrudInterface extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
}
