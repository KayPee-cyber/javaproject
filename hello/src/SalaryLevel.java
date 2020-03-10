public class SalaryLevel implements SalaryLevelInterface, Payroll
{
    private String grade;
    private double salary;

    public void setGrade(String name)
    {
        this.grade= name;
    }

    public String getGrade()
    {
        return grade;
    }
    public void setSalary(double salaree)
    {
        this.salary= salaree;
    }

    public double getSalary()
    {
        return salary;
    }

    public double calculateSalary()
{
    return salary *2;
}
    public boolean isProcessed()
    {
        return false;
    }
}
