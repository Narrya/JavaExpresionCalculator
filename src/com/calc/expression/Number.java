package com.calc.expression;

public class Number {
	private double value;

	public Number(String token) {
		this.value = Double.parseDouble(token);
	}

	public double getValue() {
		return this.value;
	}
}