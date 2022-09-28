package task2;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		int num;
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Press 1 for Addition \nPress 2 for Substraction \nPress 3 for Multiplication \nPress 4 for Division");
		num = sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Addition is: "+(a+b));
			break;
		case 2:
			System.out.println("Substraction is: "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication is: "+(a*b));
			break;
		case 4:
			System.out.println("Division is: "+(a/b));
			break;
		default:
			System.out.println("Please enter valid number.");
			break;
		}
		

	}

}
