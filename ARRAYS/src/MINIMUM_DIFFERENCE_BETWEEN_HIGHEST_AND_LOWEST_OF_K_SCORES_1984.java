import java.util.Arrays;
import java.util.Scanner;

public class MINIMUM_DIFFERENCE_BETWEEN_HIGHEST_AND_LOWEST_OF_K_SCORES_1984
{
    static int minDifference(int[] arr, int k)
    {
        if(arr.length==0||k==0)
        {
            return 0;
        }
        if(arr.length<k)
        {
            return -1;
        }
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-k;i++)
        {
            int diff=arr[i+k-1]-arr[i];
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
        int m=sc.nextInt();
        System.out.println(minDifference(arr,m));
    }
}
