import java.util.Scanner;  

public class D02L02{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int arr[]=new int[1000];
		int min=0 , max=1000 , target , targetInd=-1; 
		for(int i=0 ; i<1000 ; i++){
			arr[i]=min+ (int) (Math.random()*(max-min)+1);
		}

		double nanoStartTime = System.nanoTime();
		System.out.print("Enter target to search : ");
		target = in.nextInt();
		for(int i=0 ; i<1000 ; i++){
			if(arr[i]==target){
				targetInd=i;
				break;
			}
		}



		double nanoEndTime = System.nanoTime(); 
		double time = nanoEndTime - nanoStartTime;
		if(targetInd==-1)
			System.out.println("Target not found!");
		else
			System.out.println("Target is found in ind = "+ targetInd);


		System.out.println("time = "+time);


	}

}