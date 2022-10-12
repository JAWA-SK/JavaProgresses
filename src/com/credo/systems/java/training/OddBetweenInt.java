package com.credo.systems.java.training;

import java.util.Scanner;

public class OddBetweenInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int input = sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int secinput = sc.nextInt();
		oddInterval(input, secinput);
		sc.close();

	}

	public static void oddInterval(int input, int secinput) {
		if (input < secinput) {
			for (int i = input; i <= secinput; i++) {
				if (i % 2 != 0)
					System.out.print(i + " ");
			}
		} else {
			oddInterval(secinput, input);
		}
	}

}
