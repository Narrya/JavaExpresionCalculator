package com.calc.expression;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		System.out.println("Insert reverse polish notation string:");

		Scanner keyboard = new Scanner(System.in);
		String rpn = keyboard.nextLine();
		String[] tokens = rpn.split(" ");

		Stack<Double> stack = new Stack<Double>();

		for (String token : tokens) {
			System.out.println(token);

			try
			{
				double number = Double.parseDouble(token);
				stack.push(number);
			}
			catch(NumberFormatException e)
			{
				double x = stack.pop();
				double y = stack.pop();

				switch(token) {
					case "+":
						stack.push(y + x);
						break;

					case "-":
						stack.push(y - x);
						break;

					case "*":
						stack.push(y * x);
						break;

					case "/":
						stack.push(y / x);
						break;
				}

			}
		}

		System.out.println(stack.pop());
	}
}