package PrefixSum;

import java.util.Scanner;

public class OneDPrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[] = new int[n];
   for(int i=0;i<n;i++) {
	   arr[i]= sc.nextInt();
   }
   
   int pre[] = new int[n];
   for(int i=0;i<n;i++) {
	   if(i==0) {
		   pre[0]=arr[0];
	   }
	   pre[i] = pre[i-1]+arr[i];
   }
   
   for(int x:pre) {
	   System.out.println(x+" ");
   }
   
   
   
	}
	
	
	
	
	

}
