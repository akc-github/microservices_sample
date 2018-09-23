package com.goods.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goods.order.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
