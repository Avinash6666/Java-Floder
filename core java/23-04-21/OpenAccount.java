import java.util.Scanner;
public class OpenAccount{
	public void accountInfo(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("What Type Of Account Do You Want To Open");
		String accountType = scanner.next();

	if(accountType.equalsIgnoreCase("studentaccount")){
		Account account = new Account();
		System.out.println("Your Account Is:"+accountType.toUpperCase()+"and your balance is:"+account.minimumBalance);
	}
		else if(accountType.equalsIgnoreCase("salaryaccount")){
			System.out.println("Enter Minimum Balance");
			double mbalance = scanner.nextDouble();
			Account account = new Account(mbalance);
			System.out.println("Your Account Is:"+accountType.toUpperCase()+"and your balance is:"+account.minimumBalance);
		}
	}	
	public static void main(String[] s){
		OpenAccount openAccount = new OpenAccount();		
		openAccount.accountInfo();
	}
}
