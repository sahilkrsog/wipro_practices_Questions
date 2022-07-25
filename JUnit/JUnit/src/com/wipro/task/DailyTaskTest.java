package com.wipro.task;
import java.util.Iterator;
import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.Test;

public class DailyTaskTest {
	DailyTask task = new DailyTask();
	@Test
	public void testDoStringConcat() {
		String str ="sa hil";
		String str1 = "sa";
		String str2 = "hil";
		assertEquals("Result",str,task.doStringConcat(str1, str2));
		
	}

	@Test
	public void testSortArray() {
		int[] arr1 = {1,3,2};
		int [] arr2 =task.sortArray(arr1) ;
		int j =0;
		for(int i :arr1) {
			
			assertEquals(i,arr2[j]);
			j++;
				
		
		}
}

	@Test
	public void testCheckPresence() {
		String str = "sahil";
		String str2 = "a";
//		assertEquals(str2,task.checkPresence(str, str2));
		assertTrue(str2,task.checkPresence(str, str2));
		
	}

}
