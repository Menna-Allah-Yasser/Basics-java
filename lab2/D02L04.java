import java.util.Scanner;  
import java.lang.String;


public class D02L04{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter sentence :");
		String sen=in.nextLine();
		System.out.print("Enter word to search :");
		String word=in.nextLine();
		int ans=0 , k=sen.indexOf(word , 0);

		while(k!=-1){ 
			k=sen.indexOf(word , k+word.length());
			ans++;
		}

		System.out.println("word :"+ word +" exists " + ans);


		
	}
}
