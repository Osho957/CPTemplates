package PrefixSum;

import java.util.Scanner;

public class TwoDPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int pre[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				pre[i][j] = arr[i][j];
				if (i >= 1) {
					pre[i][j] += pre[i - 1][j];
				}
				if (j >= 1) {
					pre[i][j] += pre[i][j - 1];
				}
				if (i >= 1 && j >= 1) {
					pre[i][j] -= pre[i - 1][j - 1];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(pre[i][j] + " ");
			}
			System.out.println();
		}
	}

}
