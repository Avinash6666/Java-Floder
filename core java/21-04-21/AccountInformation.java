import java.util.Scanner;
public class AccountInformation{
	double minimumBalance;
	double balance;

	String accHolderName;
	long accHolderConNo;
	String accHolderAddr;

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account Minimum Balance");
		minimumBalance = scan.nextDouble();
		balance = minimumBalance;
		System.out.println("Enter Account Holder Name");
		accHolderName = scan.next();
		System.out.println("Enter Account Holder Contact Number");
		accHolderConNo = scan.nextLong();
		System.out.println("Enter Account Holder Addr");
		accHolderAddr = scan.next();
	}
			public static void main(String a[]){
				Account cust1 = new Account();
				Account cust2 = new Account();
			}
		}