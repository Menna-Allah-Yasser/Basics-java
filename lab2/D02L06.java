import java.util.*;  
import java.lang.String;


public class D02L06{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter sentence :");
		String sen=in.nextLine();
		System.out.print("Enter word to search :");
		String word=in.nextLine();
		int ans=0 , p1=0 ;
		StringTokenizer tokens=new StringTokenizer(sen);
		while(tokens.hasMoreTokens()){
			if(tokens.nextToken().equals(word))
				ans++;
		}		

		System.out.println("word :"+ word +" exists " + ans);


		
	}
}
