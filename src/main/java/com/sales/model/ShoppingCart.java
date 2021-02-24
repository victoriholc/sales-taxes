package com.sales.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements IShoppingCart {

	private List<IOrderGoods> listOrderGoods = new ArrayList<IOrderGoods>();

	public void addOrderGoods(IOrderGoods orderGoods) {
		listOrderGoods.add(orderGoods);
	}

	public List<IOrderGoods> getListOrderGoods() {
		return this.listOrderGoods;
	}

	public void setListOrderGoods(List<IOrderGoods> listOrderGoods) {
		this.listOrderGoods = listOrderGoods;
	}
	
}
