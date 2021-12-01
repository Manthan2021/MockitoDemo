package com.coforge.training.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;

import org.junit.Before;
import org.junit.Test;

import com.coforge.training.mockitoDemo.Employee;

public class EmployeeSpyTest {

	private Employee spyEmp;
	private Employee emp;
	private static final String FIRST_NAME = "James";
	private static final String LAST_NAME = "Gosling";
	private static final int AGE = 35;
	
	
	@Before
	public void buildSpy() {
		emp=new Employee(FIRST_NAME,LAST_NAME,AGE);
		spyEmp=spy(emp);
	}
	
	@Test
	public void verifySpyEffectOnRealInstance() {
		spyEmp.setAge(35);
		assertTrue(emp.getAge()==spyEmp.getAge());
		
	}
	@Test
	//@DisplayName("this is first name")
	public void verifySpyEffectOnRealInstance1() {
	spyEmp.setFirstName("Joe");
	assertTrue(emp.getFirstName() == spyEmp.getFirstName());
	}
	@Test
	public void verifySpyEffectOnRealInstance2() {
	spyEmp.setLastName("M");
	assertTrue(emp.getLastName() == spyEmp.getLastName());
	}
	@Test
	public void fullname()
	{
	String fName=spyEmp.getFullName();
	System.out.println("Full Name: "+fName);
	assertEquals(FIRST_NAME + " "+LAST_NAME, spyEmp.getFullName());
	}
	@Test
	public void firstname()
	{
	String fName=spyEmp.getFirstName();
	// System.out.println(fName);
	assertEquals(FIRST_NAME, spyEmp.getFirstName());
	}
	@Test
	public void lastname()
	{
	String fName=spyEmp.getLastName();
	assertEquals(LAST_NAME, spyEmp.getLastName());
	}
	
}
