package com.sales.model;

public class OrderGoods implements IOrderGoods {

	private Goods goods;

	private int quantity;

	public OrderGoods() {
		super();
	}

	public OrderGoods(Goods goods, int quantity) {
		super();
		this.goods = goods;
		this.quantity = quantity;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
