import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TWO_SUM_1
{
    static int[] twoSum(int[] arr, int target)
    {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int x=0;x<arr.length;x++)
        {
            int compelment=target-arr[x];
            if(mpp.containsKey(compelment))
            {
                return new int[]{mpp.get(compelment),x};
            }
            mpp.put(arr[x],x);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] ans=twoSum(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
