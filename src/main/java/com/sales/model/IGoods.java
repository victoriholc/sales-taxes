package com.sales.model;

public interface IGoods {

	public void setName(String name);

	public float getPrice();

	public void setPrice(float price);

	public TaxType getTaxType();

	public void setTaxType(TaxType taxType);

}
