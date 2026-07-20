import java.util.Scanner;

public class MAX_SUBARRAY_SUM_KADANE
{
    static int subarray(int[] arr)
    {
        int n=arr.length;
        int max=arr[0];
        int maxEnd=arr[0];
        for(int i=1;i<n;i++)
        {
            maxEnd=Math.max(arr[i],maxEnd+arr[i]);
            max=Math.max(max,maxEnd);
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
        System.out.println(subarray(arr));
    }
}
