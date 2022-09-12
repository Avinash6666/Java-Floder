		 import java.util.Scanner;
public class ClientTest2{
	public static void main(String[] s){
		System.out.println("Enter your role");
		Scanner scan = new Scanner(System.in);
		String role = scan.next();

		if(role.equals("management")){
			if(Institute1.courseFees == 0.0){
				//System.out.println("please reenter your password");
			}
			else {
				System.out.println("Course Fees Is: "+Institute.courseFees);
			}
		}
		else if(role.equals("student")){
			Student std = new Student();	
			System.out.println("enter your name");
			std.sname = scan.next();
			System.out.println("which course do you want");
			std.courseName= scan.next();
			System.out.println("Your Name Is: "+std.sname+"\t"+" You are selecting: "+std.courseName+" course");
		}
	}

}