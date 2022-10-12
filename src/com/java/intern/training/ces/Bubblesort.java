package com.java.intern.training.ces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bubblesort {
	static List<Integer> ab = new ArrayList<>();

	public static int in() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			ab.add(sc.nextInt());
		}
		sc.close();
		return size;
	}

	public static List<Integer> sort(List<Integer>ab) {
		if (ab.size() < 1) {
			throw new IndexOutOfBoundsException("YOUR LIST IS EMPTY");
		}

		else {
			boolean flag = true;
			while (flag == true) {
				flag = false;
				for (int i = 0; i < ab.size() - 1; i++) {
					if (ab.get(i) > ab.get(i + 1)) {
						int b = ab.get(i + 1);
						int a = ab.get(i);
						int temp = b;
						ab.set(i + 1, a);
						ab.set(i, temp);
						flag = true;
					}
				}
			}
			return ab;
		}

	}
}
