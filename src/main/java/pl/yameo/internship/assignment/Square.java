package pl.yameo.internship.assignment;

import sun.security.provider.SHA;

import java.util.Arrays;
import java.util.List;

public class Square implements Shape{
	private double dimension;

	public Square(double dimension) {
		this.dimension=dimension;
	}

	public void setDimension(double dimension) {
		setDimension(dimension);
	}


	@Override
	public String getName() {
		return "Square";
	}

	@Override
	public List<Double> listDimensions() {
		return Arrays.asList(dimension);
	}

	@Override
	public double calculateArea() {
		return dimension*dimension;
	}

	@Override
	public double calculatePerimeter() {
		return 4*dimension;
	}
}
