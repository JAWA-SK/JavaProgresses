package com.java.intern.training.ces;

import java.util.Arrays;
import java.util.Random;

public class Insertion_sort {

	public static void main(String[] args) {
		Random rand = new Random();
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
		}
		System.out.println("BEFORE----> " + Arrays.toString(arr));
		System.out.println("AFTER------> " + Arrays.toString(insertion(arr)));
	}

	public static int[] insertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}
}
