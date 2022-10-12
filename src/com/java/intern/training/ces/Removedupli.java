package com.java.intern.training.ces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Removedupli {
	public static void main(String[] args) {
		List<Integer> ab1 = new ArrayList<>();
		ab1.add(10);
		ab1.add(5);
		ab1.add(10);
		ab1.add(10);
		ab1.add(4);
		int size = ab1.size();
		remove(ab1, size);
		for (Integer i : ab1) {
			try {
				if (!i.equals(null)) {
					System.out.print(i + " ");
				}
			} catch (Exception e) {
				continue;
			}
		}
	}

	public static List<Integer> remove(List<Integer> ab1, int size) {
		for (int i = 0; i < size; i++) {
			int n = Collections.frequency(ab1, ab1.get(i));
			if (n > 1 && ab1.get(i) != null) {
				ab1.set(i, null);
			}

		}
		return ab1;
	}
}
