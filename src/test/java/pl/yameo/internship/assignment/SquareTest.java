package pl.yameo.internship.assignment;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import pl.yameo.internship.assignment.shapes.Rectangle;
import pl.yameo.internship.assignment.shapes.Square;

public class SquareTest {
	private static final double DELTA = 0.001;
	private static final double INITIAL_DIMENSION = 4.0;
	private static final String SHAPE_NAME = "Square";
	private static final double NEW_EDGE_LENGTH = 5.0;
	private static final double INITIAL_AREA = 16.0;

	@Test
	public void when_square_created_then_it_has_proper_name() {
		Square square = new Square(INITIAL_DIMENSION);
		Assert.assertEquals( SHAPE_NAME, square.getName());
	}

	@Test
	public void when_height_set_then_dimension_is_changed() {
		Square square = new Square(INITIAL_DIMENSION);
		square.setDimension(NEW_EDGE_LENGTH);
		Assert.assertEquals(NEW_EDGE_LENGTH,square.listDimensions().get(0),  DELTA);
		Assert.assertEquals(NEW_EDGE_LENGTH,square.listDimensions().get(1),  DELTA);
	}

	@Test
	public void when_width_set_then_dimension_is_changed() {
		Square square = new Square(INITIAL_DIMENSION);
		square.setDimension(NEW_EDGE_LENGTH);
		Assert.assertEquals(NEW_EDGE_LENGTH,square.listDimensions().get(0),  DELTA);
		Assert.assertEquals(NEW_EDGE_LENGTH,square.listDimensions().get(1),  DELTA);
	}

	@Test
	public void when_width_set_then_new_dimension_is_returned() {
		Square square = new Square(INITIAL_DIMENSION);
		square.setDimension(NEW_EDGE_LENGTH);
		Assert.assertEquals(NEW_EDGE_LENGTH, square.listDimensions().get(0),  DELTA);
		Assert.assertEquals(NEW_EDGE_LENGTH, square.listDimensions().get(1),  DELTA);
	}

	@Test
	public void when_rectangle_width_is_halved_then_its_area_is_halved() {
		Rectangle square = new Square(INITIAL_DIMENSION);
		Assert.assertEquals(square.calculateArea(), INITIAL_AREA, DELTA);
		square.setWidth(INITIAL_DIMENSION / 2);
		Assert.assertEquals((INITIAL_AREA / 2),square.calculateArea() , DELTA);
	}
}
