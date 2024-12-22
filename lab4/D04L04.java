import java.util.List;
import java.util.ArrayList;

public class D04L04{

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

abstract class Shape{
	
   abstract void draw();
}

class Rectangle extends Shape{

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

class Circle extends Shape{

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