package com.codesprinters.automation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class cwiczenieTest {
	
	@Test
	public void wypisywanieTestow(){
		System.out.println("Test1");
	}
	
	@Test
	public void wypisywanie2Testow(){
		System.out.println("Test2");
	}
	@Test
	public void wypisywanie3Testow(){
		System.out.println("Test3");
	}
	@Before
	public void wypisywanieBefore(){
		System.out.println("before");
	}
	@After
	public void wypisywanieAfter(){
		System.out.println("after");
	}
	@BeforeClass
	public static void wypisywanieBeforeClass(){
		System.out.println("before class");
	}
	@AfterClass
	public static void wypisywanieAfterClass(){
		System.out.println("after class");
	}
	@AfterClass
	public static void wypisywanieAfter2Class(){
		System.out.println("after 2 class");
	}
	@BeforeClass
	public static void wypisywanieBefore2Class(){
		System.out.println("before 2 class");
	}
	@After
	public void wypisywanie2After(){
		System.out.println("2 after");
	}
	@Before
	public void wypisywanie2Before(){
		System.out.println("2 before");
	}

}
