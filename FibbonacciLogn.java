import java.util.Scanner;

public class FibbonacciLogn {
	static int MAX = 1000;
    static int f[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		f = new int[MAX];
		System.out.println(fibRec(n));
	}
	
	
    //log n
	private static int fibRec(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		
		      
		int x = (n&1)==1?
				// odd
				((fibRec((n+1)/2)*fibRec((n+1)/2)+(fibRec(n/2)*fibRec(n/2)))):
				//even	
			    (2 * fibRec((n+1)/2) + fibRec(n/2))* fibRec(n/2);
		
		
		return x;
	}
	//log n
	static int fib(int n) {
		double phi = (1 + Math.sqrt(5)) / 2;
		return (int) Math.round(Math.pow(phi, n)
		                        / Math.sqrt(5));
		}
}
