import java.util.Scanner;

public class BEST_TIME_TO_BUY_AND_SELL_STOCK_II_122
{
    static int buy(int[] arr)
    {
        int profit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(buy(arr));
    }
}
