package com.codesprinters.automation;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FirstUnitTest {

	@Test
	public void shouldAddElementToArray() {

		int[] Tablica = new int[5];
		Tablica[0] = 3;
		assertEquals(Tablica[0], 3);
		}
	
	@Test
	public void shouldRemoveElementToArray(){
		List<String> list = new LinkedList<String>();
		list.remove("String");
		Assert.assertEquals(list.size(),0);
		Assert.assertFalse(list.contains("String"));
		
	}
	
	
		
	
	}
	

