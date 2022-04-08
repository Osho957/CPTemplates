import java.util.*;


public class FibbModm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int m = sc.nextInt();
           int ans = fibMod(n,m);
           System.out.println(ans);
	}

	// pissano period
	private static int fibMod(int n, int m) {
		
		List<Integer> hs = new ArrayList<>();
		hs.add(0);
		hs.add(1);
		int p=-1;
		for(int i=2;i<=m*m;i++) {
			hs.add((hs.get(i-1)+hs.get(i-2))%m);
			if(hs.get(i)==1&&hs.get(i-1)==0) {
				p=i-1;
				break;
			}
		}
		return hs.get(n%p);
	}

}
