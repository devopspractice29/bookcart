package org.devopsmarines.bookcart.authentication;

import static org.junit.Assert.assertNotNull;

import org.devopsmarines.bookcart.dao.AccountDAO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * The class <code>MyDBAuthenticationServiceTest</code> contains tests for the class <code>{@link MyDBAuthenticationService}</code>.
 * @author IB0689
 */
public class MyDBAuthenticationServiceTest {
	
	@Autowired
	private AccountDAO accountDAO;
	
	/**
	 * Run the UserDetails loadUserByUsername(String) method test.
	 *
	 * @throws Exception
	 */
	//@Test
	public void testLoadUserByUsername()
		throws Exception {
		MyDBAuthenticationService mydbAuthServ = new MyDBAuthenticationService();
		String username = "";
		UserDetails result = mydbAuthServ.loadUserByUsername(username);
		assertNotNull(result);
	}

}