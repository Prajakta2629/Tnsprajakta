package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumtionDemo {
     @Test
	 void display() 
     {
		System.setProperty("Prajakta", "Tejal");
		Assumptions.assumeTrue("Tejal".equals(System.getProperty("Prajakta")));
		
	}
     @Test
	 void display1() 
     {
		System.setProperty("Prajakta", "Tejal");
		Assumptions.assumeFalse("Tejal".equals(System.getProperty("Prajakta")));
		
	}

}
