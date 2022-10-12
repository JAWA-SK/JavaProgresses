package com.java.intern.training.ces;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int array[] = { 5, 4, 3, 2, 1 };
		quicksort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	public static void quicksort(int array[], int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		int pivot = array[highIndex];
		int leftside = lowIndex;
		int rightside = highIndex;
		while (leftside < rightside) {

			while (array[leftside] <= pivot && leftside < rightside) {
				leftside++;
			}
			while (array[rightside] >= pivot && leftside < rightside) {
				rightside--;
			}
			swap(array, leftside, rightside);
		}
		swap(array, leftside, highIndex);
		quicksort(array, lowIndex, leftside - 1);
		quicksort(array, leftside + 1, highIndex);
	}

	public static void swap(int array[], int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
