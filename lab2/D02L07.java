import java.util.*;  
import java.lang.String;
import java.util.regex.*;

public class D02L07{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter sentence :");
		String sen=in.nextLine();
		StringTokenizer tokens=new StringTokenizer(sen);
		while(tokens.hasMoreTokens()){
			String token = tokens.nextToken();
			if(Pattern.matches("A.*" , token)){
				System.out.println(token);
			}
		}

	}
}
 // {} [b] (b) b+ b* b! [^b] 