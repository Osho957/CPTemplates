import java.util.Scanner;

public class findOddtimeRepeatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc =  new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++) {
        	 arr[i]= sc.nextInt();
         }
         
         int xor = 0,res1 = 0, res2 = 0;
         for(int x:arr) {
        	 xor^=x;
         }
         int val = xor & ~(xor-1);
         for(int x:arr) {
        	 if((x&val)!=0) {
        		 res1^=x;
        	 }else {
        		 res2^=x;
        	 }
         }
         System.out.println(res1+" "+res2);
	}

}
