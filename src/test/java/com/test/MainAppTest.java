package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.MainApp;

public class MainAppTest {
	private MainApp mainApp;

	
	@Before public void setUp() { mainApp = new MainApp(); }
	 

	@Test
	public void testAddition() {
		assertEquals(14, mainApp.addition(8, 6));
		assertEquals(0, mainApp.addition(-5, 5));
		assertEquals(-10, mainApp.addition(-5, -5));
	}

	@Test
	public void testMultiply() {
		assertEquals(48, mainApp.multiply(8, 6));
		assertEquals(0, mainApp.multiply(0, 5));
		assertEquals(-25, mainApp.multiply(-5, 5));
	}
}
