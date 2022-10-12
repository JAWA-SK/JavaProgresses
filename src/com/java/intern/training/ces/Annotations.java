package com.java.intern.training.ces;

public class Annotations {

	public static void main(String[] args) {
		Plants p = new Plants();
		if (p.getClass().isAnnotationPresent(NeedWater.class)) {
			System.out.println("Yeah I need water");
			p.flower();
		} else {
			System.out.println("No I don't want water");
		}

	}

}

@NeedWater
class Plants {

	public void flower() {
		System.out.println("Blooms");
	}
}

class Animals {
	public void borderCollie() {
		System.out.println("Woof Woof");
	}
}
