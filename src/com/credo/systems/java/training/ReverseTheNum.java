package com.credo.systems.java.training;

import java.util.Scanner;

public class ReverseTheNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int input = sc.nextInt();
		System.out.print(reverse(input));
		sc.close();

	}

	public static int reverse(int input) {
		String out = "";
		while (input % 10 != 0) {
			out += Integer.toString(input % 10);
			input = input / 10;
		}
		return Integer.parseInt(out);
	}

}
