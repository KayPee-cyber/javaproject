public class ArmySalaryLevel extends SalaryLevel
{
    private double deductions;
    private double overTime;

    public void setDeductions(double deduction)
    {
        this.deductions = deduction;
    }
    public double getDeductions()
    {
        return deductions;
    }
    public void setOverTime(double overTimes)
    {
        this.overTime = overTimes;
    }
    public double getOverTime()
    {
        return overTime;
    }

    @Override
    public double calculateSalary()
    {
        return this.getSalary() *3;
    }
    public double calculateSalary(double multiplier)
    {
        return this.getSalary() * multiplier;
    }

    public double calculateSalary(double totalDeductions,
                                  double totalOvertime)

    {
        this.setOverTime(totalOvertime);
        setDeductions(totalDeductions);

        double baseSalary=getSalary()*3;

        double netSalary=(baseSalary+totalOvertime)-totalDeductions;
        return netSalary;
    }
}
