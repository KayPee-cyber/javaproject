public class Arguments
{
    public static void main (String[] args)
    {
        calculateDeductions("Mr. Ajayi", 1000,2000,3000,4000);
    }
    public static double calculateDeductions(String staffName, double...deductions)
    {
        //initialization
        double total = 0;

        for (double deduction:deductions)
        {
            total +=deduction;
        }
        System.out.println("Total deductions for "+staffName + " is: "+total);
        return total;
    }
}
