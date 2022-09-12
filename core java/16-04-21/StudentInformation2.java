import java.util.Scanner;
public class StudentInformation2{
	public static void main(String[] a){
		System.out.println("this program is  useful for reading student information");
				Student student = new Student();
			System.out.println("***********STUDENT DETAILS********************");
			System.out.println("SNAME	:\t"+student.sname);
			System.out.println("SAGE	:\t"+student.sage);
			System.out.println("SFEE 	:\t"+student.sfee);
			System.out.println("SADDR 	:\t"+student.saddr);
			System.out.println("SPHNO 	:\t"+student.sphno);
			System.out.println("SPINCODE :\t"+student.pincode);
					Scanner scanner = new Scanner(System.in);
		System.out.println("****************READING STDUENT INFORMATION FROM KEYBORAD AND ASSIGN TO STUDENT VARIABLES****************");
			System.out.println("Enter Student Name");
				student.sname = scanner.nextLine();

			System.out.println("Enter Student Age");
				student.sage = scanner.nextByte();

			System.out.println("Enter Student Fee");
				student.sfee = scanner.nextDouble();

			System.out.println("Enter Student Addr");
				student.saddr = scanner.next();

			System.out.println("Enter Student Phno");
				student.sphno = scanner.nextLong();

			System.out.println("Enter Student Pincode");
			student.pincode = scanner.nextInt();
	System.out.println("********STUDENT ACTUAL VALUES**********");
			System.out.println("SNAME	:\t"+student.sname);
			System.out.println("SAGE	:\t"+student.sage);
			System.out.println("SFEE 	:\t"+student.sfee);
			System.out.println("SADDR 	:\t"+student.saddr);
			System.out.println("SPHNO 	:\t"+student.sphno);
			System.out.println("SPINCODE :\t"+student.pincode);
					
		}
	}