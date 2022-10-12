package com.java.intern.training.ces;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SeqAndParallel {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		str(Arrays.stream(array).sequential());
		str(Arrays.stream(array).parallel());

	}

	public static void str(IntStream intStream) {
		intStream.forEach(i -> {
			System.out.println("TIME:  " + LocalTime.now() + "VALUES  " + i + "  " + "THREAD  "
					+ Thread.currentThread().getName());

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}

}
