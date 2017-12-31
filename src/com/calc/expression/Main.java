package com.calc.expression;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Insert reverse polish notation string:");

		Scanner keyboard = new Scanner(System.in);
		String rpn = keyboard.nextLine();
		String[] tokens = rpn.split(" ");

		for (String token : tokens) {
			System.out.println(token);

			try
			{
				double number = Double.parseDouble(token);
			}
			catch(NumberFormatException e)
			{
			}
		}
	}
}