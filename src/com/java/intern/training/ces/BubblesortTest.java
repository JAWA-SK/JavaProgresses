package com.java.intern.training.ces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Collections;

import org.junit.Test;

public class BubblesortTest extends Bubblesort {

	@Test
	public void bubblesortin() {
		if (in() > 0) {
			Collections.sort(ab);
			assertEquals(ab, Bubblesort.sort(ab));
			System.out.println(ab);
		}
	}

	@Test
	public void empty() {
		if (ab.size() < 1) {

			assertThrows(IndexOutOfBoundsException.class, () -> Bubblesort.sort(ab));
		}
	}
}
