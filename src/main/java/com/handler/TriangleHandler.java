package main.java.com.handler;

import main.java.com.dto.Triangle;
/*
* Main handler for implementing the Chain of Responsibility 
* Design Pattern
*/
public abstract class TriangleHandler {
	
	public TriangleHandler successor;

	public void setSuccessor(TriangleHandler successor) {
		this.successor = successor;
	}
	
	public abstract void isCorrectType(Triangle triangle);

}
