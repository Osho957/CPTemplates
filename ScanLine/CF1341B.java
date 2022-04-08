package ScanLine;

import java.util.Scanner;

public class CF1341B {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-->0) {
			 int n = sc.nextInt();
			 int k = sc.nextInt();
			 int arr[] = new int[n];
			 for(int i=0;i<n;i++) {
				 arr[i] = sc.nextInt();
			 }
			 
			 int peak =0;
			 int idx  =0;
			 
			 for(int i=1;i<k-1;i++) {
				 if(arr[i]>arr[i+1]&& arr[i]>arr[i-1]) {
					 peak++;
				 }
			 }
			 
			 int ans  = peak ;  // max peak	 
			 int i=0;
			 int j=k-1;
			 while(j<=n-2) {
				 
				 if(arr[j]>arr[j+1]&&arr[j]>arr[j-1]) {
					 peak++;
				 }
				 j++;
				 i++;
				 if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]) {
					 peak--;
				 }
              if(peak>ans) {
            	  ans = peak;
            	  idx =i;
              }
				 
			 }
			 			 
                    //parts  indexing 1 based
			 System.out.println((ans+1)+" "+(idx+1));
		 }
	}
}
