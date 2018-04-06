package com.javafee.figure;

public class MainFigure {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.podstawyFigura();
	circle.setpromien (3.0);
	circle.getField();
	circle.getCircuit();
	Rectangle rectangle = new Rectangle();
	rectangle.podstawyFigura();
	rectangle.seta (3.0);
	rectangle.setb (4.0);
	rectangle.getField();
	rectangle.getCircuit();
	Square square = new Square();
	square.podstawyFigura();
	square.seta (3.0);
	square.getField();
	square.getCircuit();
	Triangle triangle = new Triangle();
	triangle.podstawyFigura();
	triangle.seta (3.0);
	triangle.setb (2.0);
	triangle.setc (10.0);
	triangle.seth (12.0);
	triangle.getField();
	triangle.getCircuit();
}
}
