import java.util.HashSet;
import java.util.Scanner;

public class SET_MATRIX_ZEROS_73
{
    static void setZero(int[][] arr)
    {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        int m=arr.length;  //row
        int n=arr[0].length;   //col
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int rows:row)
        {
            for(int i=0;i<n;i++)
            {
                arr[rows][i]=0;
            }
        }
        for(int cols:col)
        {
            for(int i=0;i<m;i++)
            {
                arr[i][cols]=0;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        setZero(arr);
        printMatrix(arr);
    }
}
