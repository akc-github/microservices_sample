package com.goods.order.dto;

import java.util.List;

public class OrderDtlsDTO {

	long orderId;
	String customerName;
	List<OrderLineDTO> productDtls;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<OrderLineDTO> getProductDtls() {
		return productDtls;
	}

	public void setProductDtls(List<OrderLineDTO> productDtls) {
		this.productDtls = productDtls;
	}

}
