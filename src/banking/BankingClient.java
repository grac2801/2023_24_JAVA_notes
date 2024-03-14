package banking;

public class BankingClient
{

	public static void main(String[] args)
	{
		BankAccount oscar = new BankAccount(500.25);
		System.out.println(oscar);
		
		//withdraw
		oscar.withdraw(475.23);
		System.out.printf("%-6,.2f", oscar.getBalance());
		
		

	}

}
