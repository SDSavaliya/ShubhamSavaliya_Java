package task2;

import java.util.Scanner;

public class TernaryEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Type any three numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int res = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(res+" is the maximum number.");
	}

}
