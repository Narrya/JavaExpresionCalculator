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
				Number number = new Number(token);
				stack.push(number.getValue());
			}
			catch(NumberFormatException e)
			{
				TokenOperations.execute(token, stack);
			}
		}

		System.out.println(stack.pop());
	}
}