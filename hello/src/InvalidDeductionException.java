public class InvalidDeductionException extends Exception
{
    String message;
    double amount;


    public InvalidDeductionException(String message, double invalidDeduction)
    {
        super(message);
        this.amount = invalidDeduction;
    }
    public void setAmount(double amount)
    {
        this.amount =  amount;
    }

    public double getAmount()
    {
        return amount;
    }
}
