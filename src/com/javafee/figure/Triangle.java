package com.javafee.figure;

public class Triangle extends Figure{
	private Double a=0.0;
	private Double b=0.0;
	private Double c=0.0;
	private Double h=0.0;
	@Override
	public void podstawyFigura() {
		System.out.println("Jest to trójk¹t, posidaj¹cy pole i obwód");}
	
	public void seta(Double a) {
		this.a = a;
	}
	public void seth(Double h) {
		this.h = h;
	}
	public void setb(Double b) {
		this.b = b;
	}
	public void setc(Double c) {
		this.c = c;
	}
	public void getField() {
		System.out.println("Pole wynosi: " + (a*h/2));
	}
	public void getCircuit() {
		System.out.println("Obwod wynosi: " + (a+b+c));
	}
}
