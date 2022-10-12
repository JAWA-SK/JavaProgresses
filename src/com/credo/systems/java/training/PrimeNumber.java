package com.credo.systems.java.training;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int input = sc.nextInt();
		System.out.println(Prime(input));
		sc.close();

	}

	public static String Prime(int input) {
		int count = 0;
		for (int i = 1; i <= input / 2; i++) {
			if (input % i == 0)
				count++;
		}
		if (count ==1)
			return "PRIME NUMBER";
		else
			return "NON-PRIME NUMBER";
	}

}
