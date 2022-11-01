package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestLifeCycle implements LifeCycleMethodDemo {

	@Test
	void Fun() {
		System.out.println("First Test Case");
	}

}
