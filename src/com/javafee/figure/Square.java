package com.javafee.figure;

public class Square extends Figure {
	private Double side = 0.0;

	public void setSide(Double side) {
		this.side = side;
	}

	@Override
	public Double getField() {
		return side * side;
	}

	@Override
	public Double getCircuit() {
		return 4 * side;
	}
}
