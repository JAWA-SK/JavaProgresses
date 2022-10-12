package com.credo.systems.java.training;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int firstNum = sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int secondNum = sc.nextInt();
		swapping(firstNum, secondNum);
		sc.close();
	}

	public static void swapping(int firstNum, int secondNum) {
		int swap = firstNum;
		firstNum = secondNum;
		secondNum = swap;
		System.out.println("FIRST NUMBER-->" + firstNum + "\nSECOND NUMBER--->" + secondNum);
	}

}
