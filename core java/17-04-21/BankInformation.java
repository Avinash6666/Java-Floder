import java.util.Scanner;
public class BankInformation{
	public static void main(String[] a){
		Bank bank = new Bank();
		System.out.println("SBANKNAME	:\t"+bank.sbankHn);
		System.out.println("SBANKACNO	:\t"+bank.sbankAcNo);
		System.out.println("SADDR		:\t"+bank.saddr);
		System.out.println("SBANKBALANCE	:\t"+bank.sbankBalance);
		System.out.println("SPHNO		:\t"+bank.sphno);
		System.out.println("SPINCODE	:\t"+bank.spincode);
			Scanner scanner = new Scanner(System.in);
		System.out.println("****************READING BANK INFORMATION FROM KEYBORAD AND ASSIGN TO STUDENT VARIABLES****************");
			System.out.println("Enter Bank Holder Name");
				bank.sbankHn = scanner.nextLine();

			System.out.println("Enter Bank Ac No");
				bank.sbankAcNo = scanner.nextLong();

			System.out.println("Enter Bank Balance");
				bank.sbankBalance = scanner.nextDouble();

			System.out.println("Enter  Addr");
				bank.saddr = scanner.next();

			System.out.println("Enter  Phno");
				bank.sphno = scanner.nextLong();

			System.out.println("Enter Bank Pincode");
				bank.spincode = scanner.nextInt();

			System.out.println("Enter Bank Ifsc Code");
				bank.sifsc = scanner.next();
		System.out.println("**********BANK NFORMATION*********************");
			System.out.println("SBANKNAME	:\t"+bank.sbankHn);
		System.out.println("SBANKACNO	:\t"+bank.sbankAcNo);
		System.out.println("SADDR		:\t"+bank.saddr);
		System.out.println("SBANKBALANCE	:\t"+bank.sbankBalance);
		System.out.println("SPHNO		:\t"+bank.sphno);
		System.out.println("SPINCODE	:\t"+bank.spincode);
			

		}
	}