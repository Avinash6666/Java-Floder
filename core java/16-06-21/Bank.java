class Loan
{
public void amount()
{
System.out.println("All the loan properties are there");
}
}
class HouseLoan extends Loan
{
public void amount()
{
System.out.println("this is the house loan");
}
}
class PersonalLoan extends Loan
{
public void amount()
{
System.out.println("this is the personal loan amount");
}
}
class Bank
{
public static void main(String args[])
{
Loan myLoan = new Loan();
Loan myhLoan = new HouseLoan();
Loan mypLoan = new PersonalLoan();
myLoan.amount();
myhLoan.amount();
mypLoan.amount();
}
}
