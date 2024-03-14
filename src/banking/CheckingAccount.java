package banking;

public class CheckingAccount extends BankAccount
{
	private static final double FEE = 2.00;
	private static final double MIN_BALANCE = 50.00;

	public CheckingAccount(double acctBalance)
	{
		super(acctBalance);
	}

	/**
	 * Fee of $2 deducted when balance falls below $50
	 */
	public void withdraw(double amount)
	{
		super.withdraw(amount);
		if (super.getBalance() < MIN_BALANCE)
		{
			super.withdraw(FEE);
		}
	}
}
