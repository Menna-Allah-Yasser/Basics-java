import java.lang.Math;

public class D02L01{
	public static void main(String args[]){
		int arr[]=new int[1000];
		int min=0 , max=1000 , mnElement=10000 , mxElement=-1;
		double nanoStartTime = System.nanoTime(); 
		for(int i=0 ; i<1000 ; i++){
			arr[i]=min+ (int) (Math.random()*(max-min)+1);
			if(arr[i] > mxElement){
			   mxElement=arr[i];
			}
			if(arr[i] < mxElement){
			   mnElement=arr[i];
			}
		}
		double nanoEndTime = System.nanoTime(); 
		double time = nanoEndTime - nanoStartTime;
		System.out.println("max number in array = "+mxElement);
		System.out.println("min number in array = "+mnElement);
		System.out.println("time = "+time);

		

		
	}

}