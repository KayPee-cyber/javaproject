import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a,b,c;



        try
        {
            System.out.println("Please enter the first Integer: ");
            a = input.nextInt();
            System.out.println("Please enter the second Integer: ");
            b = input.nextInt();
            c = a/b;
            System.out.println("The quotient is: "+c);
        }
        catch(InputMismatchException ex)
        {
            System.out.println(" Wrong input");
        }
        catch (Exception ex)
        {
            System.out.println("That is an indivisible expression");
        }

    }
}
