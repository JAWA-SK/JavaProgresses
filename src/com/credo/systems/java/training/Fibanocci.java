package com.credo.systems.java.training;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int input = sc.nextInt();
		if (input > 0) {
			for (int i = 0; i <= input; i++) {
				System.out.print(fiban(i) + " ");
			}
		} else {
			System.out.println("ENTER THE NUMBER GREATER THAN 1");
		}
		sc.close();
	}

	public static int fiban(int i) {
		if (i <= 1)
			return i;
		return fiban(i - 1) + fiban(i - 2);
	}

}
