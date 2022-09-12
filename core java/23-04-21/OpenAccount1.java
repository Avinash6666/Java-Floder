import java.util.Scanner;
public class OpenAccount1{

	public void accountInfo(){
	Scanner scanner = new Scanner(System.in);

	System.out.println("What type of account do you want to open");
	String accountType = scanner.next();

	if(accountType.equalsIgnoreCase("studentaccount")){
		Account1 account1 = new Account1();
		System.out.println("\n\n******************\n"+
					"Account Holder Name Is :"+account1.accountHolderName.toUpperCase()+
					"Your Account1 Is :"+accountType.toUpperCase()+
						" and your balance is :"+account1.minimumBalance+
					"\n**********************");
	}
		else if(accountType.equalsIgnoreCase("salaryaccount")){
		System.out.println("\n\n Enter minimum balance");
		double mbalance = scanner.nextDouble();
		Account1 account1 = new Account1(mbalance);
 	System.out.println("\n\n**********************************************************************\n"+
				 "Account Holder Name Is: "+account1.accountHolderName.toUpperCase()+
				" Your Account1 Is: "+accountType.toUpperCase()+
						" and your balance is : "+account1.minimumBalance+
					"\n*********************************************************");
		}
	}
	public static void main(String a[]){
		OpenAccount1 openAccount1 = new OpenAccount1();
	openAccount1.accountInfo();
	}
}