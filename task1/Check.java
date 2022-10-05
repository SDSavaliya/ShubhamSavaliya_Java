package task1;
import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a==0)
		{
			System.out.println("Number is Zero.");
		}
		else if(a>0)
		{
			System.out.println("Number is Positive.");
		}
		else
		{
			System.out.println("Number is Negative.");
		}

	}

}
