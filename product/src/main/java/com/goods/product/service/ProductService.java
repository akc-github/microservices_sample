package com.goods.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goods.product.dao.ProductRepository;
import com.goods.product.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepository repo;

	public Product getProductById(long id) {
		return repo.findOne(id);
	}

}
