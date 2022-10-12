package com.java.intern.training.ces;

import java.util.Arrays;

public class Method_ReferenceComparator {
	public static int compareByName(String a,String b)
	{
	 return a.length()>b.length()?1:-1;	
	}

	public static void main(String[] args) {
		String array[]= {"Sathya","Vasanth","Jawa"};
		Arrays.sort(array, Method_ReferenceComparator::compareByName);
		System.out.println(Arrays.toString(array));

	}

}
