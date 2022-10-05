package task4;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num,sum=0,avg=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Take five inputs: ");
		for(int i=1;i<=5;i++)
		{
			num = sc.nextDouble();
			sum+=num;
			avg = sum/i;
		}
		System.out.println("Total : "+(sum));
		System.out.println("Average : "+(avg));
	}

}
