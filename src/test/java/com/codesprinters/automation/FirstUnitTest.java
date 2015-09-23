package com.codesprinters.automation;
import static org.junit.Assert.*;


import org.junit.Test;
public class FirstUnitTest {

	@Test
	public void shouldAddElementToArray(){
		
		int[] Tablica = new int [5];
		Tablica[0] = 3;
		assertEquals(Tablica[0], 3);
		
	}

	}


