package com.manning.junitbook.ch02.displayname;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test class showing the @DisplayName annotation.")
class DisplayNameTest {
	private SUT systemUnderTest = new SUT();
	
	@Test
	@DisplayName("Our system under test says hello")
	void testHello() {
		assertEquals("Hello", systemUnderTest.hello());
	}
}
