package com.credo.systems.java.training;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER ");
		int input = sc.nextInt();
		multiply(input);
		sc.close();

	}

	public static void multiply(int input) {
		for (int i = 1; i <= 10; i++) {
			System.err.println(i + " * " + input + "  =" + " " + i * input);
		}
	}

}
