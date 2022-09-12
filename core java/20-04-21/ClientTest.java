import java.util.Scanner;
	public class ClientTest{
		public static void main(String a[]){
		System.out.println("Enter your role");
		Scanner scan = new Scanner(System.in);
			String role =  scan.next();
		if(role.equalsIgnoreCase("management")){
			System.out.println("Course Fees Is:"+Institute.courseFees);
		}
	}
}