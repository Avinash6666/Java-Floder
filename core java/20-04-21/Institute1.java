import java.util.Scanner;
public class Institute1{
 	static double courseFees;
	static{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String password = scan.next();
		if(password.equals("ashok")){
			System.out.println("Please enter course Fees");
			courseFees = new java.util.Scanner(System.in).nextDouble();
		}
			else{
				System.out.println("your are not an authorized person");
			}
		}
	}