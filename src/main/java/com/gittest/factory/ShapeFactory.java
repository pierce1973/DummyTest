package com.gittest.factory;

public class ShapeFactory {

	public Shape getShape(ShapeType shapeType) throws Exception {
		
		if(shapeType == null) {
			return null;			
		}
				
		switch(shapeType) {
		case Circle:
			return new Circle();

		case Square:
			return new Square();

			default:
				throw new Exception("unknown");
		}
	}
}
