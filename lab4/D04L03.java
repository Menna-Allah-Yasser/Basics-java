import java.util.Scanner;
import java.util.function.Predicate;

public class D04L03{
	public static void main(String [] args){
		
		Scanner in = new Scanner(System.in);
		String word=in.nextLine();
		Predicate <String> test=(s)->{
			Boolean flag=true;
			for(int i=0 ; i<s.length() ; i++){
				if(!Character.isLetter(s.charAt(i))){
					flag=false;
					break;
				}
			}
			return flag;
		};
		System.out.println(test.test(word));

	}



}