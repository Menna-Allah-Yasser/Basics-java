import java.util.Scanner;

public class D01L02{
	public static void main(String [] args){
		Scanner in= new Scanner(System.in);
		int num=in.nextInt();
		if(num>0){
		  System.out.println("num>0");
		}
		else if(num==0){
		  System.out.println("num equals 0");
		}
		else{
		  System.out.println("num<0");
		}
		System.out.println("num = "+num);


				
	}

}