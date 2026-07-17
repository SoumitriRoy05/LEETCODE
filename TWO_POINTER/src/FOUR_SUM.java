import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FOUR_SUM
{
    static List<List<Integer>> fourSum(int[] arr, int target)
    {
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n-3;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            for(int j=i+1;j<n-2;j++)
            {
                if(j>0 && arr[j]==arr[j-1]) {
                    continue;
                }
                int left=i+1;
                int rgt=n-1;
                while (left<rgt)
                {
                    long sum=(long) arr[i]+arr[j]+arr[left]+arr[rgt];
                    if(sum==target)
                    {
                        list.add(Arrays.asList(arr[i],arr[j],arr[left],arr[rgt]));
                        left++;
                        rgt--;
                        while(left<rgt && arr[left]==arr[left-1])
                        {
                            left++;
                        }
                        while(left<rgt && arr[rgt]==arr[rgt-1])
                        {
                            rgt--;
                        }
                    }
                    else if(sum<target)
                    {
                        left++;
                    }
                    else
                    {
                        rgt--;
                    }
                }
            }
        }
        return list;
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
        System.out.println(fourSum(arr,target));
    }
}
