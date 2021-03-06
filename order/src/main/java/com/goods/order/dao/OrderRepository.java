package com.goods.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goods.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
