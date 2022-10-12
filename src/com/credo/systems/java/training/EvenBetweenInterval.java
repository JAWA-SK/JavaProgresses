package com.credo.systems.java.training;

import java.util.Scanner;

public class EvenBetweenInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int input = sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int secinput = sc.nextInt();
		evenInterval(input, secinput);
		sc.close();

	}

	public static void evenInterval(int input, int secinput) {
		if (input < secinput) {
			for (int i = input; i <= secinput; i++) {
				if (i % 2 == 0)
					System.out.print(i + " ");
			}
		} else {
			evenInterval(secinput, input);
		}
	}

}
