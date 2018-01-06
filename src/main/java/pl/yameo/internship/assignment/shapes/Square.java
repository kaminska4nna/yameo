package pl.yameo.internship.assignment.shapes;

import java.util.Arrays;
import java.util.List;

public class Square implements Shape{
	private double dimension;

	public Square(double dimension) {
		this.dimension=dimension;
	}

	public void setDimension(double dimension) {
			this.dimension=dimension;
		}


	@Override
	public String getName() {
		return "Square";
	}

	@Override
	public final List<Double> listDimensions() {
		return Arrays.asList(dimension);
	}

	@Override
	public final double calculateArea() {
		return dimension*dimension;
	}

	@Override
	public final double calculatePerimeter() {
		return 4*dimension;
	}
}
