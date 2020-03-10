import java.util.Arrays;

public class MatrixConverter

{
    public static void main(String[] args)
    {
        int originalMatrix[][] =  {{3,5,6}, {9,7,3},{0,2,1}};
        int convertedMatrix[][] = new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                convertedMatrix[i][j]=originalMatrix[j][i];
                System.out.print(convertedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
