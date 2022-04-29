package com.greens.main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondClass {
	
	
	@BeforeSuite
	public void sample1()
	{
		System.out.println("before suite");
	}

	@BeforeTest
	public void sample2()
	{
		System.out.println("before test");
	}
	
	@BeforeClass
	public void sample3()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void sample4()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void sample6()
	{
		System.out.println("after mathod");
	}
	
	@AfterClass
	public void sample7()
	{
		System.out.println("after class");
	}
	
	@AfterTest
	public void sample8()
	{
		System.out.println("after test");
	}
	
	@AfterSuite
	public void sample9()
	{
		System.out.println("after suite");
	}
	

	@Test(priority = 3)
	public void abc()
	{
		System.out.println("test 1");
	}
	
	@Test(invocationCount = 2)
	public void xyz()
	{
		System.out.println("test 3");
	}
	
    @Test(priority = -3)
	public void def()
	{
		System.out.println("test 2");
	}
	
}
