package task2;

import java.util.Scanner;

public class PercentageResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d,e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Physics:");
		a = sc.nextDouble();
		System.out.println("Enter marks of Chemistry:");
		b = sc.nextDouble();
		System.out.println("Enter marks of Maths:");
		c = sc.nextDouble();
		System.out.println("Enter marks of English:");
		d = sc.nextDouble();
		System.out.println("Enter marks of Computer:");
		e = sc.nextDouble();
		double total = a+b+c+d+e;
		double per = total*100/500;
		if (per > 75)
		{
			System.out.println("Distinction");
		}
		else if(60 < per && per <= 75)
		{
			System.out.println("First Class");
		}
		else if(50 < per && per <=60)
		{
			System.out.println("Second Class");
		}
		else if(35 < per && per <= 50)
		{
			System.out.println("Third Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
