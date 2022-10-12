package com.credo.systems.java.training;

import java.util.Scanner;

public class FactorialRec {
	public static int rec(int n) {
		if (n == 0)
			return 1;
		return n * (rec(n - 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int input = sc.nextInt();
		System.out.println((rec(input)));
		sc.close();
	}

}
