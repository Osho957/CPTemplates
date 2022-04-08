import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        //Brian Keringams algo
        int ans = bka(n);
        System.out.println(ans);
        // look up table method
        //precompute set bits 
        preCompute();
        System.out.println(Lookup(n));
	}

	private static void preCompute() {
		// TODO Auto-generated method stub
		BitsSetTable[0]=0;
		for(int i=0;i<256;i++) {
			BitsSetTable[i] = (i&1)+BitsSetTable[i/2];
		}
	}
    //Brian Keringams algo
	private static int bka(int n) {
		// TODO Auto-generated method 
		if(n==0) {
			return 0;
		}
		return 1+bka((n&(n-1)));
	}
	
    // look up table method
	static int BitsSetTable[] = new int [256];
	private static int  Lookup(int n) {
		return (BitsSetTable[n & 0xff]
                + BitsSetTable[(n >> 8) & 0xff]
                + BitsSetTable[(n >> 16) & 0xff]
                + BitsSetTable[n >> 24]);
	}

}
