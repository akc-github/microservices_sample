package com.goods.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goods.order.dao.CustomerRepository;
import com.goods.order.dao.OrderRepository;
import com.goods.order.dto.OrderDtlsDTO;
import com.goods.order.dto.OrderLineDTO;
import com.goods.order.model.Customer;
import com.goods.order.model.Order;
import com.goods.order.model.OrderLineItem;
import com.goods.order.model.Product;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepo;

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	ProductService prodSvc;

	public OrderDtlsDTO getOrderDtlsById(long id) {
		Order order = orderRepo.findOne(id);

		Customer cust = customerRepo.findOne(order.getOrderId());

		return createOrderDtlsDTO(order, cust);
	}

	private OrderDtlsDTO createOrderDtlsDTO(Order order, Customer cust) {
		OrderDtlsDTO dto = new OrderDtlsDTO();
		dto.setCustomerName(cust.getFirstName() + " " + cust.getLastName());
		dto.setOrderId(order.getOrderId());
		List<OrderLineDTO> orderLines = new ArrayList<OrderLineDTO>();
		for (OrderLineItem lineItem : order.getLineItems()) {
			OrderLineDTO orderLine = new OrderLineDTO();
			long prodId = lineItem.getProductId();
			Product product = prodSvc.getProductDtls(prodId);
			orderLine.setProductName(product.getName());
			orderLine.setPrice(product.getPrice());
			orderLine.setQuantity(lineItem.getQuantity());
			orderLines.add(orderLine);
		}
		dto.setProductDtls(orderLines);
		return dto;
	}

}
