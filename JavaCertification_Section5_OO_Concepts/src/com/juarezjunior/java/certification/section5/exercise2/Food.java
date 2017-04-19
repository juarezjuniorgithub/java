package com.juarezjunior.java.certification.section5.exercise2;

import java.io.Serializable;
import java.util.Date;

public class Food extends InventoryItem implements Serializable {

	private static final long serialVersionUID = -4922797783569387497L;
	private String name;
	private Double price;
	private Date validity;

	public Food() {
	}

	public Food(String name, Double price, Date validity) {
		super();
		this.name = name;
		this.price = price;
		this.validity = validity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getValidity() {
		return validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((validity == null) ? 0 : validity.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		Food other = (Food) obj;
		if (validity == null) {
			if (other.validity != null)
				return false;
		} else if (!validity.equals(other.validity))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String itemDescription() {
		return new StringBuilder(this.name).append(" is available in stock: ").append(forSale).toString();
	}

}
