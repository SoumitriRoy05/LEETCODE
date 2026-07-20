import java.util.Scanner;

public class KNAPSACK_0_1
{
    static int knapsack(int[] arr, int capacity, int[] value)
    {
        int[][] dp=new int[arr.length+1][capacity+1];
        for(int i=1;i<=arr.length;i++)
        {
            for(int w=0;w<=capacity;w++)
            {
                dp[i][w]=dp[i-1][w];
                if(arr[i-1]<=w)
                {
                    dp[i][w]=Math.max(dp[i][w], dp[i-1][w-arr[i-1]]+value[i-1]);
                }
            }
        }
        return dp[arr.length][capacity];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] value=new int[n];
        for(int i=0;i<n;i++)
        {
            value[i]=sc.nextInt();
        }
        int capacity=sc.nextInt();
        System.out.println(knapsack(arr,capacity,value));
    }
}
