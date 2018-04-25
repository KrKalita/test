package com.javafee.addition;

public class Multiplication {
	public Double firstVariable = 0.0;
	public Double secondVariable = 0.0;

	public void setFirstVariable(Double firstVariable) {
		this.firstVariable = firstVariable;
	}

	public void setSecondVariable(Double secondVariable) {
		this.secondVariable = secondVariable;
	}

	public void calculate() {
		System.out.println("iloczyn wynosi: " + (firstVariable + secondVariable));
	}

	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable * secondVariable;
	}
}
