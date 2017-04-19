package com.juarezjunior.java.certification.section5.exercise2;

public abstract class InventoryItem {

	protected Integer minQuantity;
	protected Integer maxQuantity;
	protected Boolean forSale;
	protected String remarks;

	public Integer getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(Integer minQuantity) {
		this.minQuantity = minQuantity;
	}

	public Integer getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(Integer maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public Boolean getForSale() {
		return forSale;
	}

	public void setForSale(Boolean forSale) {
		this.forSale = forSale;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public abstract String itemDescription();

}
