package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.entities.Order;
import com.devsuperior.dscommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
