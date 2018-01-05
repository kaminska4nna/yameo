package pl.yameo.internship.assignment.shapes;

import java.util.Arrays;
import java.util.List;

public class Rectangle implements Shape {
	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public String getName() {
		return "Rectangle";
	}

	@Override
	public final List<Double> listDimensions() {
		return Arrays.asList(height, width);
	}

	@Override
	public final double calculateArea() {
		return height * width;
	}

	@Override
	public final double calculatePerimeter() {
		return 2 * (height + width);
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
