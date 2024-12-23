package com;

import com.mennacode.Rectangle;
import com.mennacode.Circle;
import com.mennacode.Shape;
import java.util.List;
import java.util.ArrayList;

public class Test{

	public static void main(String []args){


		Shape shapes[]={new Rectangle(1 , 1),
				new Rectangle(2 , 2),
				new Circle(1),
				new Circle(2)
		};
		
		ArrayList<Rectangle> rects = new ArrayList<>();
		ArrayList<Circle> cirs = new ArrayList<>();


		for(Shape shape : shapes){
			if(shape instanceof Rectangle){
				rects.add((Rectangle)shape);
			}else{
				cirs.add((Circle)shape);
			}
		}

		System.out.println("Rectangles : ");
		test(rects);
		System.out.println("Circles : ");
		test(cirs);
				
	}

	public static void test(ArrayList<? extends Shape>shapes){
		for(Shape shape:shapes){
			System.out.println(shape);
		}
	}


}
