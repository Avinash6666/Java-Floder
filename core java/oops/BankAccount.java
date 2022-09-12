class BankAccount{
	static String bankName;
	static String branchName;
	static String ifsc;
	       long accName;
	       String accHName;
	       double balance;
		public static void main(String[] args){
}
	static void setBankDetails(String bankN, String branchN, String ic){
		bankName = bankN;
		branchName = branchN;
		ifsc = ic;
	}
		
	void setAccountDetails(long accN, String accHN, double bal){
		accName = accN;
		accHName = accHN;
		balance = bal;
	}

	void deposit(double amt){
		balance = balance+amt;
	}
	double withdraw(double amt){
		balance = balance-amt;
		return balance;
	}
	void currentBalance(){
		System.out.println(balance);	
	}
	static void displayBankDetails(){
		System.out.println(bankName);
		System.out.println(branchName);
		System.out.println(ifsc);
	}
	void displayAccountDetails(){
		System.out.println(accName);
		System.out.println(accHName);
		System.out.println(balance);
	}
	void displayAllValues(){
		System.out.println(bankName);
		System.out.println(branchName);
		System.out.println(ifsc);

		System.out.println(accName);
		System.out.println(accHName);
		System.out.println(balance);
	}
}
	