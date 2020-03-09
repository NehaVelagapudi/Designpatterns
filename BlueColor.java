package com.ts.design.bridge;
import java.util.logging.Logger;

public class BlueColor implements Color{
	Logger logger = Logger.getLogger(App.class.getName());
	public void applyColor(){
		logger.info("blue.");
	}
}


