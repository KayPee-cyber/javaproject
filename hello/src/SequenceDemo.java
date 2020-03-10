public class SequenceDemo
{
    public static void main (String[] args)
    {
        example1();
    }

        public static void example1 () {
            System.out.println("Hello, I am example one");
            LGA data = new LGA();
            data.setLGACode("100");
            data.setLGAName("Shomolu");

            System.out.println("LGA name is " + data.getLGAName());
        }
        public static void printTunjiLGA()
        {
            System.out.println("Tunji's LGA is Oshogbo South");
        }
        public void printDejiLGA()
        {
            System.out.println("Deji's LGA is Iseyin");
        }

        // if statement



}
