package com.javafee.figure;

public class Triangle extends Figure {
	private Double sideA = 2.0;
	private Double sideB = 0.0;
	private Double sideC = 0.0;
	private Double height = 5.0;

	public void setSideA(Double sideA) {
		this.sideA = sideA;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public void setSideB(Double sideB) {
		this.sideB = sideB;
	}

	public void setSideC(Double sideC) {
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
