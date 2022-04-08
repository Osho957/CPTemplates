import java.util.Scanner;

public class LegendreFormula {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();	
		int mp = maxP(n);
		//System.out.println(mp);
		int ans =0;
		while(x>0) {
			x=x/mp;
			ans+=x;
		}
		System.out.println(ans);

	}
	
	public static int maxP(int n) {
		int res =-1;
		for(int i=2;i*i<=n;i++) {
			while(n%i==0) {
				res =i;
				n=n/i;
			}
		}
		if(n>1) {
			res =n;
		}
		return res;
	}
}
