package com.sales.service;

import com.sales.model.IGoods;

public final class CalculateSalesService {

	private static float roundTax = 0.05f;

	public static float calculateGoodsValueTax(IGoods goods) {

		float valuePercentTax = goods.getPrice() * goods.getTaxType().getTax();
		float valueRoundTax = (float) Math.ceil(valuePercentTax / roundTax) * roundTax;

		return valueRoundTax;
	}

	public static float calculateGoodsPriceWithTax(IGoods goods) {

		float valueRoundTax = calculateGoodsValueTax(goods);

		return (float) (goods.getPrice() + valueRoundTax);
	}

	public static float calculatePriceGoods(IGoods goods, float valueRoundTax) {
		return (float) (goods.getPrice() + valueRoundTax);
	}

}
