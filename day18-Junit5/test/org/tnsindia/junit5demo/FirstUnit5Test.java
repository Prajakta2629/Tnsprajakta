package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstUnit5Test {

	@Test
	void test() {
		System.out.println("Hello EveryOne");
	}
	@Test
	@Disabled
	void display() {
		fail("hi");
	}

}
