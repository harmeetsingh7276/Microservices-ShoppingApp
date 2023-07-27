package com.harmeetsinghgorowada.orderservice.repository;

import com.harmeetsinghgorowada.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
