package Practice;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");	
			}
			System.out.print("\n");
		}
	}

}
