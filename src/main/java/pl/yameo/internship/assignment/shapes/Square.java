package pl.yameo.internship.assignment.shapes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
public class Square implements Shape {
	private double dimension;

	public Square(double dimension) {
		this.dimension=dimension;
	}

	@Override
	public String getName() {
		return "Square";
	}

	@Override
	public List<Double> listDimensions() {
		return Arrays.asList(dimension, dimension);
	}

	@Override
	public double calculateArea() {
		return dimension*dimension;
	}

	@Override
	public double calculatePerimeter() {
		return dimension*4;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}
}
