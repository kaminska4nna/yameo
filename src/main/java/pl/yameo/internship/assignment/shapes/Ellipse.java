package pl.yameo.internship.assignment.shapes;

import pl.yameo.internship.assignment.shapes.Shape;

import java.util.Arrays;
import java.util.List;

public class Ellipse implements Shape {
	private double semiMajorAxis;
	private double semiMinorAxis;

	public Ellipse(double semiMajorAxis, Double semiMinorAxis) {
		this.semiMajorAxis = semiMajorAxis;
		this.semiMinorAxis = semiMinorAxis;
	}

	@Override
	public String getName() {
		return "Ellipse";
	}

	@Override
	public final List<Double> listDimensions() {
		return Arrays.asList(semiMajorAxis, semiMinorAxis);
	}

	@Override
	public final double calculateArea() {
		return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) / 2 - Math.sqrt(semiMajorAxis * semiMinorAxis));
	}

	@Override
	public final double calculatePerimeter() {
		return Math.PI * semiMajorAxis * semiMinorAxis;
	}

	public void setSemiMajorAxis(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}

	public void setSemiMinorAxis(double semiMinorAxis) {
		this.semiMinorAxis = semiMinorAxis;
	}
}
