package com.gittest;

import com.gittest.factory.Shape;
import com.gittest.factory.ShapeFactory;
import com.gittest.factory.ShapeType;

public class HiWorldGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		Shape s = null;
		try {
			s = sf.getShape(ShapeType.Circle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.draw();
	}
	
	public String sayHi() {
		return "Hi world";
	}

}
