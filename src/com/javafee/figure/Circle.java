package com.javafee.figure;

public class Circle extends Figure {

	private Double radius = 0.0;

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double getField() {
		return radius * radius * 3.14;
	}

	@Override
	public Double getCircuit() {
		return radius * 2 * 3.14;
	}
}
