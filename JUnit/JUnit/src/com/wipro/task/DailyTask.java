package com.wipro.task;
import java.util.Arrays;

public class DailyTask {
	public String doStringConcat(String str , String str2) {
		return str+" "+str2;
	}
	public int[] sortArray(int[] arr) {
		 Arrays.sort(arr);
		 return arr;
		
	}
	public boolean checkPresence(String str,String a) {
		return str.contains(a);
	}

}
