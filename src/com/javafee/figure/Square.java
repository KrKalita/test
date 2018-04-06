package com.javafee.figure;

public class Square extends Figure {
	private Double a=0.0;
	@Override
	public void podstawyFigura() {
		System.out.println("Jest to kwadrat, posidaj¹cy pole i obwód");}
	
	public void seta(Double a) {
		this.a = a;
	}
	public void getField() {
		System.out.println("Pole wynosi: " + (a*a));
	}
	public void getCircuit() {
		System.out.println("Obwod wynosi: " + (4*a));
	}
}
