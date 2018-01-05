package pl.yameo.internship.assignment.shapes;

import java.util.Arrays;
import java.util.List;

public class Triangle implements Shape {
	private double edgeA;
	private double edgeB;
	private double edgeC;


	public Triangle(double edgeA, double edgeB, double edgeC) {
		this.edgeA = edgeA;
		this.edgeB = edgeB;
		this.edgeC = edgeC;
	}

	@Override
	public String getName() {
		return "Triangle";
	}

	@Override
	public final List<Double> listDimensions() {
		return Arrays.asList(edgeA, edgeB, edgeC);
	}

	@Override
	public final double calculateArea() {
		double halfPerimeter = calculatePerimeter() / 2;
		return Math.sqrt(halfPerimeter * (halfPerimeter - edgeA) * (halfPerimeter - edgeB) * (halfPerimeter - edgeC));
	}

	@Override
	public final double calculatePerimeter() {
		return edgeA + edgeB + edgeC;
	}

	public void setEdgeA(double edgeA) {
		this.edgeA = edgeA;
	}

	public void setEdgeB(double edgeB) {
		this.edgeB = edgeB;
	}

	public void setEdgeC(double edgeC) {
		this.edgeC = edgeC;
	}
}
