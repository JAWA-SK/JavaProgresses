package com.credo.systems.java.training;

public class PositiveNegative {

	public static void main(String[] args) {
		System.out.println(Pass(10));

	}
	public static String Pass(int i)
	{
		if(i==0)
		{
			return "Zero";
		}
		else if(i<0)
		{
			return "Negative";
		}
		else
		{
			return "Positive";
		}
	}

}
