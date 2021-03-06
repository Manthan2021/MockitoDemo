package com.coforge.training.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.coforge.training.mockitoDemo.CalculatorService;
import com.coforge.training.mockitoDemo.MathApplication;



class MathApplicationTest {

	@InjectMocks
	MathApplication mathApplication;
	
	@Mock
	CalculatorService calcService;
	
	@BeforeEach
	void setUp() throws Exception {
		
		mathApplication=new MathApplication();
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testAdd() {
		//add the behavior calculator service to add two numbers
		when(calcService.add(10.0, 20.0)).thenReturn(30.00);
		//test add functionality
		assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
		//verify the behavior
		verify(calcService).add(10.0,20.0);
		System.out.println(verify(calcService).add(10.0,20.0));
		

	}

	@Test
	void testSubtract() {
		when(calcService.subtract(20.0,10.0)).thenReturn(10.00);
		assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);
		verify(calcService).subtract(20.0,10.0);
		System.out.println(verify(calcService).subtract(20.0, 10.0));
	}

	@Test
	void testMultiply() {
		
		when(calcService.multiply(20.0,10.0)).thenReturn(200.00);
		assertEquals(mathApplication.multiply(20.0, 10.0),200.0,0);
		verify(calcService).multiply(20.0,10.0);
		System.out.println(verify(calcService).multiply(20.0, 10.0));
		
	}

	@Test
	void testDivide() {
		when(calcService.divide(20.0,10.0)).thenReturn(2.00);
		assertEquals(mathApplication.divide(20.0, 10.0),2.0,0);
		verify(calcService).divide(20.0,10.0);
		System.out.println(verify(calcService).divide(20.0,10.0));
		
		

	}

}
