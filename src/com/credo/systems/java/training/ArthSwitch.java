package com.credo.systems.java.training;

import java.util.*;

public class ArthSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE TWO NUMBERS TO PERFORM");
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println("1.ADD\n2.SUBTRACT\n3.MULTIPLY\n4.DIVIDE");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			Add(first, second);
			break;
		case 2:
			Subtract(first, second);
			break;
		case 3:
			Multiply(first, second);
			break;
		case 4:
			Divide(first, second);
			break;
		}
		sc.close();
	}

	public static void Add(int n, int m) {
		print(n + m);
	}

	public static void Subtract(int n, int m) {
		print(n - m);
	}

	public static void Multiply(int n, int m) {
		print(n * m);
	}

	public static void Divide(int n, int m) {
		print(n / m);
	}

	public static void print(int a) {
		System.out.println(a);
	}
}
