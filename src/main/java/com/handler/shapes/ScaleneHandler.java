package main.java.com.handler.shapes;

import main.java.com.dto.Triangle;
import main.java.com.handler.TriangleHandler;

public class ScaleneHandler extends TriangleHandler {

	@Override
	public void isCorrectType(Triangle triangle) {
		if(triangle.isScalene())
			System.out.println("DEBUG:The triangle is Scalene");
		
	}

}
