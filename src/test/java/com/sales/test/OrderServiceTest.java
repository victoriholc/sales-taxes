package com.sales.test;

import static com.sales.service.CalculateSalesService.calculateGoodsPriceWithTax;
import static com.sales.service.CalculateSalesService.calculateGoodsValueTax;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sales.model.Goods;

@SuppressWarnings("deprecation")
public class OrderServiceTest {

	BeanFactory factory;

	@Before
	public void setUp() throws Exception {
		Resource resource = new ClassPathResource("applicationContext.xml");
		factory = new XmlBeanFactory(resource);
	}

	@Test
	public void testCalculateValueTaxGoodsBook() {
		Goods goods = (Goods) factory.getBean("goods1");
		assertEquals(0.0f, calculateGoodsValueTax(goods), 0);
	}

	@Test
	public void testCalculateValueTaxGoodsMusicCD() {
		Goods goods = (Goods) factory.getBean("goods2");
		assertEquals(1.5f, calculateGoodsValueTax(goods), 0);
	}

	@Test
	public void testcalculatePriceGoodsBook() {
		Goods goods = (Goods) factory.getBean("goods3");
		assertEquals(0.85f, calculateGoodsPriceWithTax(goods), 0);
	}

	@Test
	public void testcalculatePriceGoodsMusicCD() {
		Goods goods = (Goods) factory.getBean("goods2");
		assertEquals(16.49f, calculateGoodsPriceWithTax(goods), 0);
	}

}
