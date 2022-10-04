package task3;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		//String name,city,gender,qualification,pass = null;
		System.out.println("Press 1 to Signup. \nPress 2 for Signin.");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.print("Enter your Name: ");
			String name = sc.next();
			System.out.print("Enter your City: ");
			String city = sc.next();
			System.out.print("Enter your Gender: ");
			String gender = sc.next();
			System.out.print("Enter your Qualification: ");
			String qualification = sc.next();
			System.out.print("Enter your Password: ");
			String pass = sc.next();
			System.out.println("Details Saved.");
			System.out.println("If you want to login then press 2\nfor exit press 0.");
			int n2 = sc.nextInt();
			switch(n2)
			{
			case 2:
				System.out.println("Enter your password: ");
				pass = sc.next();
				if(pass.equals(pass))
				{
					System.out.println(name);
					System.out.println(city);
					System.out.println(gender);
					System.out.println(qualification);					
				}
				break;
			case 0:
				System.out.println("You have exited the program.");
				break;
			default:
				System.out.println("Please tray again using valid input.");
				break;
			}
			break;
		case 2:
			System.out.println("Enter your password: ");
			pass = sc.next();
			if(pass.equals(user1.pass))
			{
				System.out.println(user1.name);
			}
			if(pass.equals(user2.pass))
			{
				System.out.println(user2.name);
			}
			break;
		}

	}
	public class user1{
		static String name = "Shubham";
		static String pass = "1234";
	}
	public class user2{
		static String name = "Kuldeep";
		static String pass = "5678";
	}

}
