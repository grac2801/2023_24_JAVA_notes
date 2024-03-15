package banking;

public class BankingClient
{

	public static void main(String[] args)
	{
		BankAccount oscar = new BankAccount(500.25);
		System.out.println(oscar);
		
		//withdraw
		oscar.withdraw(475.23);
		double bal = oscar.getBalance();
		System.out.printf("$%,.2f%n", oscar.getBalance());
		System.out.println(oscar);
		
		

	}

}
