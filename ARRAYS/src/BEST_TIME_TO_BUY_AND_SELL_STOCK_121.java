import java.util.Scanner;

public class BEST_TIME_TO_BUY_AND_SELL_STOCK_121
{
    static int best(int[] arr)
    {
        int min=arr[0];
        int max=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            else
            {
                int profit=arr[i]-min;
                max=Math.max(max,profit);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(best(arr));
    }
}
