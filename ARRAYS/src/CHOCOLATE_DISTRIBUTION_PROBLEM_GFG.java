import java.util.Arrays;
import java.util.Scanner;

public class CHOCOLATE_DISTRIBUTION_PROBLEM_GFG
{
    static int chocolates(int[] arr, int m)
    {
        if(arr.length==0||m==0)
        {
            return 0;
        }
        if(arr.length<m)
        {
            return -1;
        }
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-m;i++)
        {
            int diff=arr[i+m-1]-arr[i];
            min=Math.min(diff,min);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m= sc.nextInt();
        System.out.println(chocolates(arr,m));
    }
}
