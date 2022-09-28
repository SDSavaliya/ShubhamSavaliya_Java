package task2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		CheckPrime(n);
	}
		static void CheckPrime(int n) {
			int i,counter=0;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				counter++;
			}
		}
		if(counter>2)
		{
			System.out.println("Number is not prime.");
		}
		else
		{
			System.out.println("Number is prime.");
		}
		
		
	}

}
