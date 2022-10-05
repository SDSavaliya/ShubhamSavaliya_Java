package task4;

import java.util.Scanner;

public class NumUsingWhile {
	public static void main(String[] args) {
		int n,i=1;
		System.out.print("Enter the limit:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}

}
