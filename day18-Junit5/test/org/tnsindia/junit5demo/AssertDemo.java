package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertDemo {
    @Test
	public void AssertDemo()
	{
		assertEquals(12,12);
	}
    @Test
    public void AssertDemo1()
    {
	  assertNull(null);
    }



}
