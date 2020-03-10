public class Loops
{
    public static void main (String[] args)
    {
        array();
        arrays();
        doArrays();
    }

    static String[] local = new String[4];

    public static void array()
    {
        for (int i = 0; i < local.length; i++) {
            System.out.println(i);
        }
    }
    public static void arrays()
    {
        int j = 0;
        while (j < local.length)
        {
            System.out.println(j);
            j++;
        }
    }

    public static void doArrays()
    {
        int k = 0;
        do
        {
            System.out.println(k);
            k++;
        }
        while (k < local.length);
    }
}

