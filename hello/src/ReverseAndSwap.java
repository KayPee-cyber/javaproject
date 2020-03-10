import java.util.Arrays;

public class ReverseAndSwap
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int temp0 = array[0];
        array [0] =  array[8];
        array[8] =  temp0;

        int temp1= array[1];
        array [1] =  array[7];
        array[7] =  temp1;

        int temp2 = array[2];
        array [2] =  array[6];
        array[6] =  temp2;

        int temp3 = array[3];
        array [3] =  array[5];
        array[5] =  temp3;
        System.out.println(Arrays.toString(array));
    }

}
