import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		int marks,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects: ");
		for(int i=1;i<=5;i++)
		{
			marks = sc.nextInt();
			sum+=marks;
		}
		System.out.println("Total marks: "+(sum));
		System.out.println("Percentage is : "+((sum*100)/500));

	}

}
