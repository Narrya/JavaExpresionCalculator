package com.calc.expression;

import java.util.Stack;

public class TokenOperations {
	public static void execute(String token, Stack<Double> stack) {
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