package org.devopsmarines.bookcart.entity;

import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class OrderTest {

	private String testId = "QWE12234";
	private Date testOrderDate = getOrderDate();
	private int testOrderNum = 12585;
	private double testAmount = 10.00;

	private String testCustomerName = "NewCustomer";
	private String testCustomerAddress = "NewStreet, New city, New State, 2222";
	private String testCustomerEmail = "newemail@mail.com";
	private String testCustomerPhone = "22342342";

	@Test
	public void testSetId() {
		Order order = new Order();
		order.setId(testId);
		assertTrue(order.getId() == testId);
	}

	private Date getOrderDate() {
		long yourmilliseconds = System.currentTimeMillis();
		//SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
		Date resultdate = new Date(yourmilliseconds);
		return resultdate;
	}

	@Test
	public void testSetOrderDate() {
		Order order = new Order();
		order.setOrderDate(testOrderDate);
		assertTrue(order.getOrderDate().compareTo(testOrderDate) == 0);
	}
	
	@Test
	public void testSetOrderNum() {
		Order order = new Order();
		order.setOrderNum(testOrderNum);
		assertTrue(order.getOrderNum() == testOrderNum);
	}
	
	@Test
	public void testAmount() {
		Order order = new Order();
		order.setAmount(testAmount) ;
		assertTrue(order.getAmount() == testAmount);
	}

	@Test
	public void testCustomerName() {
		Order order = new Order();
		order.setCustomerName(testCustomerName);
		assertTrue(order.getCustomerName() == testCustomerName);
	}
	
	@Test
	public void testCustomerAddress() {
		Order order = new Order();
		order.setCustomerAddress(testCustomerAddress);
		assertTrue(order.getCustomerAddress()== testCustomerAddress);
	}
	
	@Test
	public void testCustomerEmail() {
		Order order = new Order();
		order.setCustomerEmail(testCustomerEmail);
		assertTrue(order.getCustomerEmail()== testCustomerEmail);
	}
	
	@Test
	public void testCustomerPhone() {
		Order order = new Order();
		order.setCustomerPhone(testCustomerPhone);
		assertTrue(order.getCustomerPhone()== testCustomerPhone);
	}
	
}