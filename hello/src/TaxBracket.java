public class TaxBracket
{
    private String grade;
    private String taxPercent;
    private double taxAmount;
    private double afterTaxAmount;

    public void setGrade(String gradient)
    {
        this.grade= gradient;
    }

    public String getGrade()
    {
        return grade;
    }
    public void setTaxPercent(String tax)

    {
        this.taxPercent= tax;
    }

    public String getTaxPercent()
    {
        return taxPercent;
    }
    public void setTaxAmount(double taxMoney)
    {
        this.taxAmount = taxMoney;
    }

    public double getTaxAmount()
    {
        return taxAmount;
    }
    public void setAfterTaxAmount(double afterTax)
    {
        this.afterTaxAmount= afterTax;
    }

    public double getAfterTaxAmount()
    {
        return afterTaxAmount;
    }
}
