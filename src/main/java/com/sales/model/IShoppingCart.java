package com.sales.model;

import java.util.List;

public interface IShoppingCart {

	public void addOrderGoods(IOrderGoods orderGoods);

	public List<IOrderGoods> getListOrderGoods();
}
