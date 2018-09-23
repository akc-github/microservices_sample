package com.goods.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goods.order.model.Product;

@FeignClient("product")
public interface ProductService {

	@RequestMapping(method = RequestMethod.GET, value = "/products/{id}")
	Product getProductDtls(@PathVariable("id") long id);
}
