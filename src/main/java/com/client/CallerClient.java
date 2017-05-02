package main.java.com.client;
/*
 * Triangle challenge
 * Based on the command line arguments(side1, side2 & side3 of the triangle) determine the 
 * type of triangle it is
 * 
 * */
import main.java.com.dto.Triangle;
import main.java.com.handler.TriangleHandler;
import main.java.com.handler.shapes.EquilateralHandler;
import main.java.com.handler.shapes.IsoscelesHandler;
import main.java.com.handler.shapes.ScaleneHandler;

public class CallerClient {

	private TriangleHandler tHandler1;

	public CallerClient() {
		// Initialize the Chain on responsibility.
		tHandler1 = new EquilateralHandler();
		TriangleHandler tHandler2 = new IsoscelesHandler();
		TriangleHandler tHandler3 = new ScaleneHandler();
		tHandler1.setSuccessor(tHandler2);
		tHandler2.setSuccessor(tHandler3);

	}

	public static void main(String a[]) {
		CallerClient client = new CallerClient();
		Triangle triangle = new Triangle(Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
		client.tHandler1.isCorrectType(triangle);
	}

}
