package task1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		double p,t,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Principal Amount: ");
		p = sc.nextDouble();
		System.out.println("Time(in years): ");
		t = sc.nextDouble();
		System.out.println("Rate of Interest: ");
		r = sc.nextDouble();
		System.out.println("Simple Interest is :"+(p*t*r/100));
	}

}
