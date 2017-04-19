package com.juarezjunior.java.certification.section5.exercise2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {

	private static final long serialVersionUID = 2970993196606199393L;
	private String customerName;
	private String shippingAddress;
	private Date orderDate;
	private List<OrderItem> orderItems;

	public Order() {
	}

	public void addOrderItem(OrderItem orderItem) {
		if (orderItems == null) {
			orderItems = new ArrayList<OrderItem>();
		}
		orderItems.add(orderItem);
	}

	public Order(String customerName, String shippingAddress, Date orderDate, List<OrderItem> orderItens) {
		super();
		this.customerName = customerName;
		this.shippingAddress = shippingAddress;
		this.orderDate = orderDate;
		this.orderItems = orderItens;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((shippingAddress == null) ? 0 : shippingAddress.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((orderItems == null) ? 0 : orderItems.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (shippingAddress == null) {
			if (other.shippingAddress != null)
				return false;
		} else if (!shippingAddress.equals(other.shippingAddress))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (orderItems == null) {
			if (other.orderItems != null)
				return false;
		} else if (!orderItems.equals(other.orderItems))
			return false;
		return true;
	}

}
