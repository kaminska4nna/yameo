package pl.yameo.internship.assignment;

public class Square extends Rectangle {
	public Square(double dimension) {
		super(dimension, dimension);
	}

	@Override
	public String getName() {
		return "Square";
	}

	@Override
	public void setHeight(double height) {
		setDimension(height);
	}

	@Override
	public void setWidth(double width) {
		setDimension(width);
	}

	public void setDimension(double dimension) {
		super.setHeight(dimension);
		super.setWidth(dimension);
	}
}
