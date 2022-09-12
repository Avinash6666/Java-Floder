
public class Account1{
	public double minimumBalance;
	public String accountHolderName;
	{
		System.out.println("\n\n Enter Account Holder Name");
		accountHolderName = new java.util.Scanner(System.in).next();
	}
	Account1(){
		minimumBalance = 0.0;
	}
	Account1(double mbalance){
		minimumBalance = mbalance;
	}
}
