package com.sales.model;

public class Goods implements IGoods {

	private String name;

	private float price;

	private TaxType taxType;

	public Goods() {
		super();
	}

	public Goods(String name, float price, TaxType taxType) {
		super();
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public TaxType getTaxType() {
		return taxType;
	}

	public void setTaxType(TaxType taxType) {
		this.taxType = taxType;
	}

}
