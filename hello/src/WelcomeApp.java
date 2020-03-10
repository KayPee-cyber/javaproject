public class WelcomeApp
{
    public static void main(String[] args) {
        System.out.println("Welcome Kparo, you are too much O jare!");

        RunExamples();

        WelcomeApp app = new WelcomeApp();
        app.RunExample2();
    }

    public static void  RunExamples()
    {
//        SequenceDemo demo = new SequenceDemo();
//        demo.example1();

        SequenceDemo.example1();

        //static method
        SequenceDemo.printTunjiLGA();

        //instance method
        SequenceDemo deji = new SequenceDemo();
        deji.printDejiLGA();
    }

    public void RunExample2()
    {
        System.out.println("Hello from Example2");

        SalaryLevel level1 = new SalaryLevel();
        level1.setGrade("100");
        level1.setSalary(10000);

        ArmySalaryLevel level2 = new ArmySalaryLevel();
        level2.setGrade("120");
        level2.setSalary(20000);
        level2.setDeductions(1000);
        level2.setOverTime(500);

        NNPCSalaryLevel level3 = new NNPCSalaryLevel();
        level3.setGrade("130");
        level3.setSalary(300000);
        level3.setBonus(3500);
    }

}
