package com.java.intern.training.ces;

class Impute {
	private int salary;
	private String role;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

abstract class Salary extends Impute {
	abstract void creditSalary();
}

class Manager extends Salary {
	public void creditSalary() {
		System.out.println(getRole() + "      " + getSalary());
	}
}

class New_Employee extends Salary

{
	@Override
	public void creditSalary() {
		System.out.println(getRole() + "  " + getSalary());
	}
}

class Old_Employee extends Salary {
	@Override
	public void creditSalary() {

		System.out.println(getRole() + "  " + getSalary());
	}

}

public class Java_Mock {

	public static void main(String[] args) {
		Salary s = new Manager();
		s.setRole("Manager");
		s.setSalary(1000000);
		s.creditSalary();
		Salary s1 = new Old_Employee();
		s1.setRole("OldEmployee");
		s1.setSalary(99999);
		s1.creditSalary();
		Salary s2 = new New_Employee();
		s2.setRole("NewEmployee");
		s2.setSalary(88888);
		s1.creditSalary();
	}

}