    public class Casting
    {
    public static void main(String[] args)
    {
        NNPCSalaryLevel nnpcSalaryLevel = new NNPCSalaryLevel();
        nnpcSalaryLevel.setSalary(1000);
        nnpcSalaryLevel.setBonus(200);
        nnpcSalaryLevel.setGrade("Level 15");

        ArmySalaryLevel armySalaryLevel = new ArmySalaryLevel();
        armySalaryLevel.setSalary(4000);
        armySalaryLevel.setDeductions(500);
        armySalaryLevel.setOverTime(300);
        armySalaryLevel.setGrade("Level 16");

        SalaryLevel salaryLevel = new SalaryLevel();
        salaryLevel.setSalary(6000);
        salaryLevel.setGrade("Level 12");

        processSalary(nnpcSalaryLevel);
        processSalary(armySalaryLevel);
        processSalary(salaryLevel);

        processSalary2(salaryLevel);
        processSalary2(nnpcSalaryLevel);

        }
        public static void processSalary(SalaryLevel level)
        {
        double netSalary = 0;
        if (level instanceof ArmySalaryLevel)
        {
            System.out.println("Level is Army Salary Level");
            ArmySalaryLevel armySalaryLevel = (ArmySalaryLevel)level;
            System.out.println("Army salary overtime is "+armySalaryLevel.getOverTime());
            System.out.println("Army salary deduction is "+armySalaryLevel.getDeductions());

        }
        else if (level instanceof NNPCSalaryLevel)
        {
            System.out.println("Level is NNPC Salary Level");
            NNPCSalaryLevel nnpcSalaryLevel = (NNPCSalaryLevel)level;
            System.out.println("NNPC salary bonus is: "+ nnpcSalaryLevel.getBonus());
        }
        else
        {
            System.out.println("Level is default Salary Level");
            SalaryLevel salaryLevel = (SalaryLevel)level;
            System.out.println("The default salary is: "+salaryLevel.getSalary());
            System.out.println("The default grade is: "+salaryLevel.getGrade());
        }
        }
        public static void processSalary2(SalaryLevelInterface level)
        {
            double netSalary = 0;

//            ArmySalaryLevel army = new ArmySalaryLevel();
//            SalaryLevel army2 = new ArmySalaryLevel();
//            SalaryLevelInterface army3 = new ArmySalaryLevel();

            System.out.println("Calculated salary is->"+level.calculateSalary());
            if (level instanceof ArmySalaryLevel)
            {
                System.out.println("Level is Army Salary Level");
                ArmySalaryLevel armySalaryLevel = (ArmySalaryLevel)level;
                System.out.println("Army salary overtime is "+armySalaryLevel.getOverTime());
                System.out.println("Army salary deduction is "+armySalaryLevel.getDeductions());

            }
            else if (level instanceof NNPCSalaryLevel)
            {
                System.out.println("Level is NNPC Salary Level");
                NNPCSalaryLevel nnpcSalaryLevel = (NNPCSalaryLevel)level;
                System.out.println("NNPC salary bonus is: "+ nnpcSalaryLevel.getBonus());
            }
            else
            {
                System.out.println("Level is default Salary Level");
                SalaryLevel salaryLevel = (SalaryLevel)level;
                System.out.println("The default salary is: "+salaryLevel.getSalary());
                System.out.println("The default grade is: "+salaryLevel.getGrade());
            }
        }
        public static void processArmySalary(ArmySalaryLevel level)
        {
        }
        }
