package task2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.print("Enter a Year:");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if(year % 100==0 && year % 400 == 0 || year % 4 == 0)
		{
			System.out.println(year+" is a leap year.");
		}
//		else if(year % 4 == 0)
//		{
//			System.out.println(year+" is a leap year.");
//		}
		else
		{
			System.out.println(year+" is not a leap year.");
		}

	}

}
