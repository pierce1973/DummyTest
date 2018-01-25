package com.gittest.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ShapeFactoryTest {
	
	ShapeFactory sf;
	@Before
	public void setup() {
		sf = new ShapeFactory();
	}
	
//	@InjectMocks
//	
//	
//	@Mock
//	ShapeType s;
	
	@Test
	public void runTest() throws Exception {
				
		assertTrue(sf.getShape(ShapeType.Circle) instanceof Circle);
	}

}
