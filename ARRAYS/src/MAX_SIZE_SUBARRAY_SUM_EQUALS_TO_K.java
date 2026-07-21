import java.util.HashMap;
import java.util.Scanner;

public class MAX_SIZE_SUBARRAY_SUM_EQUALS_TO_K
{
    static int maxSubarray(int[] arr, int k)
    {
        HashMap<Integer, Integer> mpp=new HashMap<>();
        int sum=0, max=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                max=i+1;
            }
            if(mpp.containsKey(sum-k))
            {
                max=Math.max(max,i-mpp.get(sum-k));
            }
            mpp.putIfAbsent(sum,i);
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
        int k=sc.nextInt();
        System.out.println(maxSubarray(arr,k));
    }
}
