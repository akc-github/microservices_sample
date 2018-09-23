package com.goods.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.goods.product.model.Product;
import com.goods.product.service.ProductService;

@RestController
public class ProductsController {

	@Autowired
	ProductService prdSvc;

	@GetMapping(path = "/products")
	public String getProductList() {
		return "Hello product world!";
	}

	@GetMapping(path = "/products/{id}", produces = "application/json")
	public ResponseEntity<Product> getProductById(@PathVariable("id") long id) {
		Product product = prdSvc.getProductById(id);

		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Product>(product, headers, HttpStatus.OK);

	}
}
