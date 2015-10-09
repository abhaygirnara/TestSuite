package com.suite.test;

import static org.junit.Assert.assertTrue;

import com.suite.test.group.ShippingServiceTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.suite.test.group.AuthServiceTests;

public class SecondTest {
	@Test
	@Category({ AuthServiceTests.class, ShippingServiceTests.class })
	public void testSth() throws Exception {
		System.out.println("SecondTest.testSth run");
		assertTrue(true);
	}

	@Test
	@Category({ ShippingServiceTests.class })
	public void testAnotherThing() throws Exception {
		System.out.println("SecondTest.testAnotherThing run");
		assertTrue(true);
	}
}
