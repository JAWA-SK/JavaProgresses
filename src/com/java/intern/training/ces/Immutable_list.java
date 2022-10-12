package com.java.intern.training.ces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Immutable_list {

	public static void main(String[] args) {
	    List<String>jawa=new ArrayList<>();
	    jawa=Collections.unmodifiableList(jawa);
	     jawa.add("jawa");
	     jawa.add("priya");
	     jawa.add("hello");
	     jawa.remove("jawa");
	     jawa.forEach(System.out::println);

	}

}
