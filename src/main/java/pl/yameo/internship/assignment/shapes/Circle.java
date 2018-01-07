package pl.yameo.internship.assignment.shapes;

import java.util.Arrays;
import java.util.List;


public class Circle extends Ellipse {
	public Circle(Double radius) {
		super(radius, radius);
	}

	@Override
	public String getName() {
		return "Circle";
	}

	@Override
	public void setSemiMajorAxis(double semiMajorAxis) {
		setRadius(semiMajorAxis);
	}

	@Override
	public void setSemiMinorAxis(double semiMinorAxis) {
		setRadius(semiMinorAxis);
	}

	public void setRadius(Double radius) {
		super.setSemiMajorAxis(radius);
		super.setSemiMinorAxis(radius);
	}
}
