package com.hello;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		StringCalculator.add("1,2");
	}
	@Test(expected =RuntimeException.class)
	public void testIsNumberGreaterThanTwo(){
		StringCalculator.add("1,2,3");
	}

}
