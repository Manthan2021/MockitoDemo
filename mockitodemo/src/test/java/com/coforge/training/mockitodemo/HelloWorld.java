package com.coforge.training.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.coforge.training.mockitoDemo.IDemo;

public class HelloWorld {
@Test
public void greetTest() {
	
	IDemo d=mock(IDemo.class);//create mock object of demo
	when(d.greet()).thenReturn(IDemo.S);
	System.out.println("Demo Greets:"+d.greet());
	//when-specify the behavior
	//then-describe changes you expect by specified behavior
	when(d.greet()).thenReturn(IDemo.S);
	System.out.println("Demo Greets:"+d.greet());
	
	assertEquals(d.greet(),IDemo.S);
	
}
	
	
	
}
