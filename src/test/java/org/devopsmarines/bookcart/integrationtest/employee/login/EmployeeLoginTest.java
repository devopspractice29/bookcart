package org.devopsmarines.bookcart.integrationtest.employee.login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmployeeLoginTest {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/bookcart";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	//@Test
	public void test() throws Exception {
		driver.get(baseUrl + "/bookcart/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("employee1");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		assertEquals("Account Info", driver.getTitle());
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if ("Online Shop".equals(driver.findElement(By.cssSelector("div.site-name")).getText()))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		try {
			assertTrue(isElementPresent(By.linkText("Home")));
		} catch (Error exception) {
			verificationErrors.append(exception.toString());
		}
		try {
			assertTrue(isElementPresent(By.linkText("Logout")));
		} catch (Error exception) {
			verificationErrors.append(exception.toString());
		}
		try {
			assertTrue(isElementPresent(By.linkText("Order List")));
		} catch (Error exception) {
			verificationErrors.append(exception.toString());
		}
		try {
			assertTrue(isElementPresent(By.linkText("My Cart")));
		} catch (Error exception) {
			verificationErrors.append(exception.toString());
		}
		driver.findElement(By.xpath("//a[contains(text(),'Product\n		List')]")).click();
		assertEquals("Product List", driver.getTitle());
		driver.findElement(By.linkText("My Cart")).click();
		try {
			assertEquals("Customer Information:", driver.findElement(By.cssSelector("h3")).getText());
		} catch (Error exception) {
			verificationErrors.append(exception.toString());
		}
		try {
			assertTrue(isElementPresent(By.cssSelector("input.button-send-sc")));
		} catch (Error exception) {
			verificationErrors.append(exception.toString());
		}
		driver.findElement(By.linkText("Logout")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
