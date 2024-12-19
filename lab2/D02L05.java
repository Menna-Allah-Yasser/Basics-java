import java.util.Scanner;  
import java.lang.String;


public class D02L05{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter sentence :");
		String sen=in.nextLine();
		System.out.print("Enter word to search :");
		String word=in.nextLine();
		int ans=0 , p1=0 ;
		String temp;

		while(p1<=sen.length()-word.length()){ 
			temp=sen.substring(p1 , p1+word.length());
			if(temp.equals(word)){
				ans++;
			}
			p1++;
		}

		System.out.println("word :"+ word +" exists " + ans);


		
	}
}
