package com.suite.test;

import static org.junit.Assert.assertTrue;

import com.suite.test.group.AuthServiceTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({ AuthServiceTests.class })
public class FirstTest {
	@Test
	public void testSth() throws Exception {
		System.out.println("FirstTest.testSth run");
		assertTrue(true);
	}

	@Test
	public void testAnotherThing() throws Exception {
		System.out.println("FirstTest.testAnotherThing run");
		assertTrue(true);
	}
}
