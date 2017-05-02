package main.java.com.handler.shapes;

import main.java.com.dto.Triangle;
import main.java.com.handler.TriangleHandler;

public class EquilateralHandler extends TriangleHandler{

	@Override
	public void isCorrectType(Triangle triangle) {
		if(triangle.isEquilateral())
			System.out.println("DEBUG:The triangle is Equilateral");
		else
			super.successor.isCorrectType(triangle);
	}

}
