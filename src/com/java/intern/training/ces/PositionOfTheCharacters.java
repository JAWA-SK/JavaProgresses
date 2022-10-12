package com.java.intern.training.ces;

public class PositionOfTheCharacters {

	public static void main(String[] args) {
		String input = "madam";
		System.out.println("The no of fixed characters are: "+Position(input));

	}

	public static int Position(String input) {
		int answer = 0;
		StringBuilder builder = new StringBuilder();
		builder.append(input);
		builder.reverse();
		for (int i = 0; i < input.length(); i++) {
			if (builder.charAt(i) == (input.charAt(i))) {
				answer++;
			}
		}
		return answer;
	}

}
