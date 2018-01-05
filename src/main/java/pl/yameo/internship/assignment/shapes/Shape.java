package pl.yameo.internship.assignment.shapes;

import java.util.List;

public interface Shape {
	String getName();
	List<Double> listDimensions();
	double calculateArea();
	double calculatePerimeter();
}
