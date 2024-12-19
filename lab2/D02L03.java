import java.util.Scanner;  

public class D02L03{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		final int SZ=1000;	
		int arr[]=new int[SZ];
		int min=0 , max=1000 , target , targetInd=-1 , l=0 , r=999 , mid; 
		for(int i=0 ; i<SZ ; i++){
			arr[i]=min+ (int) (Math.random()*(max-min)+1);
		}

		double nanoStartTime = System.nanoTime();
		System.out.print("Enter target to search : ");
		target = in.nextInt();
		boolean swapped=false;
   		for (int i = 0; i < SZ-1; i++){   
        		for(int j=0 ; j<SZ-i-1;j++){
           			if(arr[j+1]<arr[j]){
            				//swap
            				int temp=arr[j];
            				arr[j] = arr[j+1];
            				arr[j+1] =temp;
            				swapped=true;
            			}
        		}
       			if(!swapped)
        			break;
    		}

		
		while(l<=r){
			mid=l+(r-l)/2;
			if(arr[mid]==target){
				targetInd=mid;
				break;
			}
			else if(arr[mid]>target){
				r=mid-1;
			}
			else{
				l=mid+1;
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