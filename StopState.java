package com.ts.design;
public class StopState implements State {

	   public void doAction(Context context) {
	      System.out.println(" stop state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}


