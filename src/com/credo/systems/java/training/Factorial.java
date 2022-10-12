package com.credo.systems.java.training;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mul = 1;
		System.out.println("ENTER THE NUMBER");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			mul *= i;
		}
		System.out.println(mul);
		sc.close();

	}

}
