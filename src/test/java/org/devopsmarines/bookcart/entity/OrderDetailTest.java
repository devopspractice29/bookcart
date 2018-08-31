package org.devopsmarines.bookcart.entity;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

public class OrderDetailTest {

	private String testId = "IDCOMMONLI";
	private Order testOrder = getTestOrder();

	private Product testProduct = getTestProduct();
	private int testQuanity = 20;
	private double testPrice = 20.00;
	private double testAmount = 10.00;
	

	@Test
	public void testSetGetId() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setId(testId);
		assertTrue(orderDetail.getId() == testId);
	}

	@Test
	public void testSetGetQuantity() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setQuanity(testQuanity);
		assertTrue(orderDetail.getQuanity() == testQuanity);
	}
	
	@Test
	public void testSetGetPrice() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setPrice(testPrice);
		assertTrue(orderDetail.getPrice() == testPrice);
	}
	
	@Test
	public void testSetGetAmount() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setAmount(testAmount);
		assertTrue(orderDetail.getAmount() == testAmount);
	}
	@Test
	public void testSetGetOrder() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setOrder(testOrder);
		Order newOrder = orderDetail.getOrder();
		assertTrue(newOrder.getOrderNum() == getTestOrder().getOrderNum());
		assertTrue(newOrder.getAmount() == getTestOrder().getAmount());
		assertTrue(newOrder.getCustomerAddress() == getTestOrder().getCustomerAddress());
		assertTrue(newOrder.getCustomerName() == getTestOrder().getCustomerName());
		assertTrue(newOrder.getCustomerPhone() == getTestOrder().getCustomerPhone());
		assertTrue(newOrder.getOrderDate().compareTo(getTestOrder().getOrderDate()) == 0);
		assertTrue(newOrder.getId() == getTestOrder().getId());
	}
	
	@Test
	public void testSetGetProduct() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setProduct(testProduct);
		Product testProductNew = getTestProduct();
		assertTrue(orderDetail.getProduct().getCode() == testProductNew.getCode());
		assertTrue(orderDetail.getProduct().getCreateDate().compareTo(testProductNew.getCreateDate()) ==0);
		assertTrue(Arrays.equals(orderDetail.getProduct().getImage(),testProductNew.getImage()));
		assertTrue(orderDetail.getProduct().getName() == testProductNew.getName());
		assertTrue(orderDetail.getProduct().getPrice() == testProductNew.getPrice());
	}
	
	private Order getTestOrder() {
		Order order = new Order();
		order.setAmount(10.00);
		order.setCustomerAddress("TestDoor, Test street, Test Town, City");
		order.setCustomerEmail("testemail@email.com");
		order.setCustomerName("testCustomer");
		order.setCustomerPhone("123456");
		order.setId("12345");
		order.setOrderDate(new Date(1535633851472l));
		order.setOrderNum(33333);
		return order;
	}

	private Product getTestProduct() {
		Product product = new Product();
		product.setCode("testCode");
		product.setCreateDate(new Date(1535633851472l));
		product.setImage(new byte[10000]);
		product.setName("TestName");
		product.setPrice(3000);
		return product;
	}

}