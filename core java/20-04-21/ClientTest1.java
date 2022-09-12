import java.util.Scanner;
public class ClientTest1{
	public static void main(String a[]){
		System.out.println("Enter your role");
		Scanner scan = new Scanner(System.in);
		String role = scan.next();
		if(role.equals("management")){
			System.out.println("Course Fees:"+Institute1.courseFees);
		}
			else if(role.equals("student")){
				Student std = new Student();
					System.out.println("Enter your name");
					std.sname = scan.next();
					System.out.println("Which course do you want");
						std.courseName = scan.next();
					System.out.println("Your Name Is:"+"\t"+"Your are selecting:"+"\t"+std.courseName);
			}
		}
	}			
