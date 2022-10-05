package task4;

import java.util.Scanner;

public class AreaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Area of Triangle \nPress 2 for Area of Rectangle \nPress 3 for Area of Circle");
		n = sc.nextInt();
		switch(n)
		{
		case 1:
			double length,height;
			System.out.print("Enter the length: ");
			length = sc.nextDouble();
			System.out.print("Enter the height: ");
			height = sc.nextDouble();
			System.out.println("Area of Triangle is: "+(0.5*length*height));
			break;
		case 2:
			double l,w;
			System.out.print("Enter the length: ");
			l = sc.nextDouble();
			System.out.print("Enter the width: ");
			w = sc.nextDouble();
			System.out.println("Area of Rectangle is: "+(l*w));
			break;
		case 3:
			double r;
			System.out.print("Enter the radius: ");
			r = sc.nextDouble();
			System.out.println("Area of Circle is: "+(3.14*r*r));
			break;
		default:
			System.out.println("Please enter valid number.");
			break;
		}
		


	}

}
