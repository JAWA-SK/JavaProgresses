package com.java.intern.training.ces;

import java.time.*;
import java.util.*;

public class DisplayTime {

	public static void main(String[] args) {
		try {
			System.err.println("\t TIME ZONES OF DIFFERENT COUNTRIES");
			Map<Integer, String> ab = new HashMap<>();
			int i = 1;
			for (String a : ZoneId.getAvailableZoneIds()) {
				ab.put(i, a);
				i++;
			}
			for (Object m : ab.keySet())
				System.out.println(m + " " + ab.get(m));
			Scanner sc = new Scanner(System.in);
			System.out.println("\n ENTER THE COUNTRY ID");
			int o = sc.nextInt();
			String a = ab.get(o);
			LocalTime m = LocalTime.now(ZoneId.of(a));
			LocalTime m1 = LocalTime.now();
			System.out.println("\n THE TIME ZONE OF " + a + " IS : " + m);
			System.err.println("\n CURRENT TIME : " + m1);
			sc.close();
		} catch (Exception e) {
			System.err.println("\t\tYOU HAVE ENTERED THE WRONG INPUT");
		}
	}

}
