package com.javafee.figure;

public class Triangle extends Figure {
	private Double sideA = 2.0;
	private Double sideB = 0.0;
	private Double sideC = 0.0;
	private Double height = 5.0;

	public void setShortSide(Double sideA) {
		this.sideA = sideA;
	}

	public void seth(Double height) {
		this.height = height;
	}

	public void setLongSide(Double sideB) {
		this.sideB = sideB;
	}

	public void setc(Double sideC) {
		this.sideC = sideC;
	}

	@Override
	public Double getField() {
		return sideA * height / 2;
	}

	@Override
	public Double getCircuit() {
		return sideA + sideB + sideC;
	}
}
