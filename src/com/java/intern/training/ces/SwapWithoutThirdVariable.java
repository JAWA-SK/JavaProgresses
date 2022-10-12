package com.java.intern.training.ces;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int FirstNum = 10;
		int SecondNum = 15;
		System.out.println("Before Swapping----->" + FirstNum + " " + SecondNum);
		FirstNum = FirstNum + SecondNum;
		SecondNum = FirstNum - SecondNum;
		FirstNum = FirstNum - SecondNum;
		System.out.println("\nAfter  Swapping----->" + FirstNum + " " + SecondNum);
	}

}
