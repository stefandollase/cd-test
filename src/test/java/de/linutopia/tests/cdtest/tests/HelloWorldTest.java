package de.linutopia.tests.cdtest.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.linutopia.tests.cdtest.HelloWorld;

public class HelloWorldTest {
	@Test
	public void testMessage() {
		assertEquals("Hello World!", new HelloWorld().message());
	}
}
