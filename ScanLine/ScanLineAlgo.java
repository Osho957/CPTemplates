package ScanLine;

import java.util.Scanner;

public class ScanLineAlgo {
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    solve();
	}

	private static void solve() {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		int pre[] = new int[n+1];
        int q = sc.nextInt();
        while(q-->0) {
        	int l=sc.nextInt(),r=sc.nextInt(),x=sc.nextInt();
        	pre[l]+=x;
        	pre[r+1]-=x;
        }
        int s =0;
        for(int i=0;i<n;i++) {
        	s+=pre[i];
        	arr[i]+=s;
        }
        for(int x:arr) {
        	System.out.print(x+" ");
        }System.out.println();
	}

}
