public class InvalidDeductionRuntimeException extends RuntimeException
{
    String message;
    double amount;

    public InvalidDeductionRuntimeException(String message, double invalidDeduction)
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
