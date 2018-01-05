package pl.yameo.internship.assignment;

public class Circle extends Ellipse {
	public Circle(double radius) {
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



	public void setRadius(double radius) {
		super.setSemiMajorAxis(radius);
		super.setSemiMinorAxis(radius);
	}
}
