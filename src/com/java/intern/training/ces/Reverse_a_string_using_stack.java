package com.java.intern.training.ces;

import java.util.Stack;

public class Reverse_a_string_using_stack {

	public static void main(String[] args) {
		String a="jawahar";
		Stack<String>ab=new Stack<>();
		for(int i=0;i<a.length();i++)
		{
			ab.push(a.charAt(i)+"");
		}
		for(int i=0;i<a.length();i++)
		{
			System.out.print(ab.pop());
		}
        
	}

}
