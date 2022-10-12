package com.java.intern.training.ces;

import java.util.Scanner;

interface Star {
	void Print(int n);
}

public class PatternUsingLambda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Pattern(input);
		sc.close();
	}

	public static void Pattern(int input) {
		int max = input;
		Star DecreasingStar = (n) -> {
			for (int i = n; i < max; i++) {
				System.out.print("*");
			}
		};

		Star IncreasingStar = (n) -> {
			for (int i = 0; i <= n; i++) {
				System.out.print("*");
			}

		};
		Star DecreasingSpace = (n) -> {
			for (int i = n; i < max - 1; i++) {
				System.out.print(" ");
			}
		};
		Star IncreasingSpace = (n) -> {
			for (int i = 0; i <= n; i++) {
				System.out.print(" ");
			}
		};
		for (int i = 0; i < max; i++) {
			DecreasingSpace.Print(i);
			IncreasingStar.Print(i);
			IncreasingStar.Print(i - 1);
			System.out.println();
		}
		for (int i = 1; i < max; i++) {
			IncreasingSpace.Print(i - 1);
			DecreasingStar.Print(i + 1);
			DecreasingStar.Print(i);
			System.out.println();
		}
	}
}
