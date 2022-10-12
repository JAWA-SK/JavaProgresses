package com.java.intern.training.ces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IOBuffer {

	public static void main(String[] args) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("cena.txt"));
			writer.write("jawahar how are you");
			writer.write("\nI'm fine what about you ");

			String names[] = { "vasanth", "sathya", "jawahar" };
			for (String dis : names) {
				writer.write("\n" + dis);
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			BufferedReader read = new BufferedReader(new FileReader("cena.txt"));
			String readlinebyline;
			while ((readlinebyline = read.readLine()) != null)
				System.out.println(readlinebyline);
			read.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
