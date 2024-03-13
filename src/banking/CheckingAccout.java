package banking;

public class CheckingAccout extends BankAccount
{
    private static final double FEE = 2.00;
    private static final double MIN_BALANCE = 50.00;
    
    
    public CheckingAccout (double acctBalance)
    {
        super(acctBalance);
    }
    
    /**
     * Fee of $2 deducted when balance falls below $50
     */
    public void withdraw(double amount)
    {
        
    }
}
