package com.java.intern.training.ces;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RemovedupliTest {
static List<Integer>ab1=new ArrayList<>();
static List<Integer>ab2=new ArrayList<>();
	@Test
	public void test() {
		ab1.add(10);
		ab1.add(10);
		ab1.add(15);
		ab2.add(10);
		ab2.add(15);
		assertEquals(Removedupli.remove(ab1,ab1.size()),ab2);
	}

}
