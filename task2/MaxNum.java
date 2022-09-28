package task2;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter 3 numbers: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is maximum number.");
			}
			else
			{
				System.out.println(c+" is maximum number.");
			}
		}
		else if(b>c)
		{
			if(b>a)
			{
				System.out.println(b+" is maximum number.");
			}
			else
			{
				System.out.println(a+" is maximum number.");
			}
		}
		else
		{
			System.out.println(c+" is maximum number.");
		}
	}

}
