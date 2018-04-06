package com.javafee.figure;

public class Rectangle extends Figure {
	private Double a=0.0;
	private Double b=0.0;
	@Override
	public void podstawyFigura() {
		System.out.println("Jest to prostok¹t, posidaj¹cy pole i obwód");}
	
	public void seta(Double a) {
		this.a = a;
	}
	public void setb(Double b) {
		this.b = b;
	}
	public void getField() {
		System.out.println("Pole wynosi: " + (a*b));
	}
	public void getCircuit() {
		System.out.println("Obwod wynosi: " + (2*a+2*b));
	}
}
