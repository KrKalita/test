package com.javafee.figure;

public class Rectangle extends Figure {
	private Double shortSide = 0.0;
	private Double longSide = 0.0;

	public void setShortSide(Double shortSide) {
		this.shortSide = shortSide;
	}

	public void setLongSide(Double longSide) {
		this.longSide = longSide;
	}

	@Override
	public Double getField() {
		return shortSide * longSide;
	}

	@Override
	public Double getCircuit() {
		return 2 * shortSide + 2 * longSide;
	}
}
