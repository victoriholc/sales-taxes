package com.sales.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sales.model.ShoppingCart;

@SuppressWarnings("deprecation")
public class shopping {

	
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		ShoppingCart shoppingCart1 = (ShoppingCart) factory.getBean("shoppingCart1");
		ShoppingCart shoppingCart2 = (ShoppingCart) factory.getBean("shoppingCart2");
		ShoppingCart shoppingCart3 = (ShoppingCart) factory.getBean("shoppingCart3");

		PrintSalesService.printOrderDetails(shoppingCart1, "Input 1", "Output 1");
		PrintSalesService.printOrderDetails(shoppingCart2, "Input 2", "Output 2");
		PrintSalesService.printOrderDetails(shoppingCart3, "Input 3", "Output 3");
	}

}
