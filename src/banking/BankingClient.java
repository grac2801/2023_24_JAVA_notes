package banking;

public class BankingClient
{

	public static void main(String[] args)
	{
		BankAccount oscar = new BankAccount(500.25);
		System.out.println(oscar);
		
		//withdraw
		oscar.withdraw(475.23);
		System.out.println(oscar);
		//deposit
		oscar.deposit(3425.89);
		System.out.println(oscar);
        
		CheckingAccount ch1 = new CheckingAccount(1_000);
		System.out.println(ch1);
        
		

	}

}
