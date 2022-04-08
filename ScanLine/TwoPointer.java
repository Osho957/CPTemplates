package ScanLine;

import java.util.Scanner;

public class TwoPointer {

	// k subarray max sum
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int k = sc.nextInt();
		
  
     int sum =0;
     for(int i=0;i<k;i++) {
    	 sum+=arr[i];
     }
     
     int i =0;
     int j =k-1;
     int ans = Integer.MIN_VALUE;
     while(j<=n-2) {
    	 j++;
    	 sum+=arr[j];
    	 sum-=arr[i];
    	 i++;
    	ans = Math.max(sum, ans);
     }
	System.out.println(ans);
	
 	}
}
