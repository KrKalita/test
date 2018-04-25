package com.javafee.addition;

public class Addition {
	public Double firstVariable = 0.0;
	public Double secondVariable = 0.0;

	public void setFirstVariable(Double firstVariable) {
		this.firstVariable = firstVariable;
	}

	public void setSecondVariable(Double secondVariable) {
		this.secondVariable = secondVariable;
	}

	public void calculate() {
		System.out.println("suma wynosi: " + (firstVariable + secondVariable));
	}

	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable + secondVariable;
	}

	public Double calculate(String firstVariable, String secondVariable) {
		return Double.parseDouble(firstVariable) + Double.parseDouble(secondVariable);
	}
}