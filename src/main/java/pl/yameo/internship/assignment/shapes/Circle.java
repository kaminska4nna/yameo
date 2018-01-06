package pl.yameo.internship.assignment.shapes;

import java.util.Arrays;
import java.util.List;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius= radius;
	}

	@Override
	public String getName() {
		return "Circle";
	}

	@Override
	public final List<Double> listDimensions() {
		return Arrays.asList(radius);
	}

	@Override
	public final double calculateArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public final double calculatePerimeter() {
		return Math.PI*radius*2;
	}



	public void setRadius(double radius) {
		this.radius=radius;
	}
}
