package com.javafee.figure;

public class Circle extends Figure {

	private Double promien=0.0;
	@Override
	public void podstawyFigura() {
		System.out.println("Jest to ko³o, posidaj¹ce pole i obwód");}
	
	public void setpromien(Double promien) {
		this.promien = promien;
	}
	public void getField() {
		System.out.println("Pole wynosi: " + (promien*promien*3.14));
	}
	public void getCircuit() {
		System.out.println("Obwod wynosi: " + (promien*2*3.14));
	}
}
