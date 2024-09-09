package com.testng.training;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest3 {
	@BeforeClass
	public void Beforeclass() {
		System.out.println("before class");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After class");
		
	}
	@BeforeTest
	public void Beforetest() {
		System.out.println("before Test");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("After test");
		
	}
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("before suite");
	}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("After suite");
	}
	
	
	
	
	@BeforeMethod
	
	public void beforemethod() {
		System.out.println("before method");
	}

	@AfterMethod
	  
	  public void aftermethod() {
			System.out.println("after  method");
	  }
}
	  
  
  
 
  