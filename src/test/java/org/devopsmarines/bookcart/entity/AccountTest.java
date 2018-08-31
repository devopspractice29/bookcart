package org.devopsmarines.bookcart.entity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountTest {

	private String testUserName = "testmail@mail.com";
	private String testPassword = "password!@#";
	private boolean testActive = true;
	private String testUserRole = "employee";

	@Test
	public void testSetGetUserName() {
		Account account = new Account();
		account.setUserName(testUserName);
		assertTrue(account.getUserName() == testUserName);
	}

	@Test
	public void testSetGetPassword() {
		Account account = new Account();
		account.setPassword(testPassword);
		assertTrue(account.getPassword() == testPassword);
	}
	
	@Test
	public void testSetGetActive() {
		Account account = new Account();
		account.setActive(testActive) ;
		assertTrue(account.isActive() == testActive);
	}

	@Test
	public void testSetGetUserRole() {
		Account account = new Account();
		account.setUserRole(testUserRole);
		assertTrue(account.getUserRole() == testUserRole);
	}
}