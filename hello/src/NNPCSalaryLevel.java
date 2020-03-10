public class NNPCSalaryLevel extends SalaryLevel
{
    private double bonus;

    public  void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double getBonus()
    {
        return bonus;
    }
    public double calculateSalary()
    {
        double baseSalary =  this.getSalary()*4;
        return baseSalary+bonus;
    }
}
