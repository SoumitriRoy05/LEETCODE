import java.util.Scanner;

public class UNBOUNDED_KNAPSACK
{
    static int knapsack(int[] arr, int capacity, int[] value)
    {
        int[] dp=new int[capacity+1];
        for(int i=0;i<arr.length;i++)
        {
            for(int w=0;w<=capacity;w++)
            {
                if(arr[i]<w)
                {
                    dp[w]=Math.max(dp[w],dp[w-arr[i]]+arr[i]);
                }
            }
        }
        return dp[capacity];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] val=new int[n];
        for(int i=0;i<n;i++)
        {
            val[i]=sc.nextInt();
        }
        int capacity=sc.nextInt();
        System.out.println(knapsack(arr,capacity,val));
    }
}
