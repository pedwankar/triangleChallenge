package main.java.com.handler.shapes;

import main.java.com.dto.Triangle;
import main.java.com.handler.TriangleHandler;

public class IsoscelesHandler extends TriangleHandler{

	@Override
	public void isCorrectType(Triangle triangle) {
		if(triangle.isIsosceles())
			System.out.println("DEBUG:The triangle is Isosceles");
		else
			super.successor.isCorrectType(triangle);	
	}

}
