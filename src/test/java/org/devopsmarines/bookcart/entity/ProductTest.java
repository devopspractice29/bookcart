package org.devopsmarines.bookcart.entity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProductTest {

	private String testCode = "#12345";
	private String testName = "testMailName";
	private double testPrice = 10.00;

	private Integer number = 10000;
	private byte[] testImage = new byte[number];

	@Test
	public void testSetCode() {
		Product product = new Product();
		product.setCode(testCode);
		assertTrue(product.getCode() == testCode);
	}

	@Test
	public void testSetName() {
		Product product = new Product();
		product.setName(testName);
		assertTrue(product.getName() == testName);
	}

	@Test
	public void testSetPrice() {
		Product product = new Product();
		product.setPrice(testPrice);
		assertTrue(product.getPrice() == testPrice);
	}

	@Test
	public void testSetGetImage() {
		Product product = new Product();
		product.setImage(testImage);
		assertTrue(product.getImage() == testImage);
	}
}