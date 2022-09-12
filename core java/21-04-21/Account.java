import java.util.Scanner;
public class Account{
	double minimumBalance;		
	double balance;			

	String accHolderName;
	long   accHolderContNo;		
	String accHolderAddress;			

	{	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Minimum Balance");
		minimumBalance = scan.nextDouble();
		
		balance = minimumBalance;
		
		System.out.println("Enter Account Holder Name");
		accHolderName = scan.next();
		
		System.out.println("Enter Account Holder Contact Nummber");
		accHolderContNo = scan.nextLong();

		System.out.println("Enter Account Holder Address");
		accHolderAddress = scan.next();
	
	}

	void accountInfo(){
		System.out.println("MinimumBalance \t: "+minimumBalance);
		System.out.println("MainBalance \t: "+balance);
		System.out.println("AccHolderName \t: "+accHolderName);
		System.out.println("AccHolderContNo \t: "+accHolderContNo);
		System.out.println("AccHolderAddress \t: "+accHolderAddress);

	}	
	public static void main(String[] s){
		Account cust1 = new Account();
		System.out.println("********************");
		Account cust2 = new Account();
		System.out.println("\n\n\n********************");
		cust1.accountInfo();
		System.out.println("\n\n********************");		
		cust2.accountInfo();
	}
}