package com.mennacode;


public class Circle extends Shape{

	private final double r;

	public Circle(double r){
		this.r=r;
	}
	
	public void draw(){
		System.out.println("drawing Circle shape...");
	}

	@Override
	public String toString(){
		return "Circle {r= "+this.r+"}";
	}


}