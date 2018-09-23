package com.goods.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goods.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
