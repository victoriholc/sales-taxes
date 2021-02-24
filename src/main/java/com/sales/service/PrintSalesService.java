package com.sales.service;

import java.text.DecimalFormat;
import java.text.Format;

import javax.swing.JOptionPane;

import com.sales.model.IOrderGoods;
import com.sales.model.IShoppingCart;

public final class PrintSalesService {

	public static void printOrderDetails(IShoppingCart shoppingCart, String titleInput, String titleOutput) {

		StringBuilder printOrder = new StringBuilder();
		
		Format formt = new DecimalFormat("0.00");
		float totalPrice = 0.0f;
		float totalTax = 0.0f;
		
		printOrder.append(titleInput).append(":\n");
		
		for (IOrderGoods orderGoods : shoppingCart.getListOrderGoods()) {
			
			printOrder.append(orderGoods.getQuantity()).append(" - ").append(orderGoods.getGoods().getName());
			printOrder.append(" - at ").append(orderGoods.getGoods().getPrice()).append("\n");
		}		
		
		printOrder.append("\n");
		printOrder.append(titleOutput).append(":\n");
		for (IOrderGoods orderGoods : shoppingCart.getListOrderGoods()) {
			
			float valueRoundTax = CalculateSalesService.calculateGoodsValueTax(orderGoods.getGoods());
			float priceWithTax = CalculateSalesService.calculatePriceGoods(orderGoods.getGoods(), valueRoundTax)
					* orderGoods.getQuantity();

			totalTax += (valueRoundTax * orderGoods.getQuantity());
			totalPrice += priceWithTax;

			printOrder.append(orderGoods.getQuantity()).append(" - ");
			printOrder.append(orderGoods.getGoods().getName()).append(": ").append(formt.format(priceWithTax));
			printOrder.append("\n");
		}

		printOrder.append("Sales Tax: ").append(formt.format(totalTax));
		printOrder.append("\nTotal: ").append(formt.format(totalPrice));

		System.out.println(printOrder);
		JOptionPane.showMessageDialog(null, printOrder.toString(), titleInput, JOptionPane.INFORMATION_MESSAGE);
	}

}
