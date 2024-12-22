package com.mennacode;


public class Rectangle extends Shape{

	private final double l1;
	private final double l2; 

	public Rectangle(double l1 , double l2){
		this.l1=l1;
		this.l2=l2;
	}

	
	public void draw(){
		System.out.println("drawing Rectangle shape...");
	}

	@Override
	public String toString(){
		return "Rectangle {l1= "+this.l1+" l2= "+this.l2+"}";
	}
	

}
