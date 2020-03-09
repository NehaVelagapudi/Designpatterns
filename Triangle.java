package com.ts.design.bridge;
import java.util.logging.Logger;

public class Triangle extends Shape{
	Logger logger = Logger.getLogger(App.class.getName());
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		logger.info("Triangle filled with color ");
		color.applyColor();
	} 

}


