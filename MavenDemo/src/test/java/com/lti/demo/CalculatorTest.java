package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		int res=new Calculator().add(10, 20);
		assertEquals(30, res);
	}
	
	@Test
	public void test1() {
		int res=new Calculator().add(-10, 20);
		assertEquals(10, res);
	}

}
