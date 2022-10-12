package com.java.intern.training.ces;

class parent {
	public void showSomething(String animal) {
		System.out.println(animal + "  " + "parent class called");
	}
}

class child extends parent {
	public void showSomething(String animal) {
		// super.showSomething(animal);
		System.out.println(animal + "  " + "child class called");
	}

	public void showSomething(int countOfAnimal) {
		System.out.println(countOfAnimal);
	}
}

public class MethodOverridingAndLoading {

	public static void main(String[] args) {
		child c = new child();
		c.showSomething("A Dog");
		c.showSomething(5);

	}

}
