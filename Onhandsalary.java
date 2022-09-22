import java.util.*;
public class Onhandsalary
{
	public static void main(String[] args) {
	    double ctc;
		Scanner sc = new Scanner(System.in);
		ctc=sc.nextInt();
		double a=1.98;
		double tax = ctc*(a/100);
		double pf = ctc*(18.0/100.0);
		double c = 2400;
		double onHand = ctc-tax-pf-c;
		//System.out.println(tax+ "      "+ pf);
		System.out.println(onHand/12);
	}
		
}
