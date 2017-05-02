package main.java.com.handler;

import main.java.com.dto.Triangle;

public abstract class TriangleHandler {
	
	public TriangleHandler successor;

	public void setSuccessor(TriangleHandler successor) {
		this.successor = successor;
	}
	
	public abstract void isCorrectType(Triangle triangle);

}
