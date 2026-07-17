import java.util.HashMap;
import java.util.Scanner;

public class SUBARRAY_SUM_DIVISIBLE_BY_K_974 {
    static int subarray(int[] arr, int k)
    {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int prefix=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            prefix+=i;
            int remainder=prefix%k;
            if(remainder<0)
            {
                remainder+=k;
            }
            count+=mpp.getOrDefault(remainder,0);
            mpp.put(remainder,mpp.getOrDefault(remainder,0)+1);
        }
        return count;
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
        System.out.println(subarray(arr,k));
    }
}
