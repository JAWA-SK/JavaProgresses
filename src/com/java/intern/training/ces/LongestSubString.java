package com.java.intern.training.ces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LongestSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.print(" "+theLongest(input));
		sc.close();

	}

	public static int theLongest(String input) {
		List<String>string=new ArrayList<>();
		String length = "";
		if (input.length() <= 0) {
			return 0;
		}
		for (int i = 0; i < input.length(); i++) {
			length += input.charAt(i);

			for (int j = i + 1; j < input.length(); j++) {
				if (!length.contains(input.charAt(j) + "")) {
					length += input.charAt(j);
				}
				else
				{
					break;
				}
			}
			string.add(length);
			length = "";
		}
		Collections.sort(string, (s1,s2)->s1.length()>s2.length()?1:-1);
		System.out.print(string.get(string.size()-1));
		return string.get(string.size()-1).length();
	}

}
