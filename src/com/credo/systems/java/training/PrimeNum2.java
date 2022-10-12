package com.credo.systems.java.training;

import java.util.Scanner;

public class PrimeNum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int input = sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int secinput = sc.nextInt();
		interval(input, secinput);
		sc.close();

	}

	public static void interval(int input, int secinput) {
		int count;
		if (input < secinput) {
			for (int i = input; i <= secinput; i++) {
				count = 0;
				for (int j = 1; j <= Math.sqrt(i); j++) {
					if (i % j == 0)
						count++;
				}
				if (count == 1) {
					System.out.print(i + " ");
				}
			}
		} else {
			interval(secinput, input);
		}
	}

}
