import java.util.Scanner;
import java.util.function.BiFunction;

public class D04L02{

	public static void main(String [] args){

		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();		
		System.out.println(betterString(s1 , s2 , (a , b) -> s1.length()>s2.length()?a:b));
		

	}

	public static String betterString(String s1 , String s2 , BiFunction <String , String , String> condition){
		return condition.apply(s1,s2);	

	}


}