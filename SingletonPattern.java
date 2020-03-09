package com.ts.design.singleton;
public class SingletonPattern {
public static void main(String[] args){
	SingleObject object = SingleObject.getInstance();
	object.showMessage();
}
}


