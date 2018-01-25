package com.gittest.factory;

public enum ShapeType {
	Circle, Square;
	
	public int getValue() {
		return this.getValue() * 2;
	}
}
