public class IfSample{

	public static void main(String []args){
		int x =10 , y=20;
		if(x<y){
		  System.out.println("x<y");
		}
		x*=2;
		if(x==y){
		  System.out.println("x==y");
		}
		x*=2;
		if(x>y){
		  System.out.println("x>y");
		}
		if(x==y){
		  System.out.println("x==y and you won't see this");
		}
	}
}


	