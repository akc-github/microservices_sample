package com.goods.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.goods.order.dto.OrderDtlsDTO;
import com.goods.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderSvc;

	@GetMapping(path = "/orders")
	public String getOrder() {
		return "Hello order world!";
	}

	@GetMapping(path = "/orders/{id}")
	public ResponseEntity<OrderDtlsDTO> getOrderById(@PathVariable("id") long id) {
		OrderDtlsDTO orderDtls = orderSvc.getOrderDtlsById(id);

		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<OrderDtlsDTO>(orderDtls, headers, HttpStatus.OK);
	}
}
