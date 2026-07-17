import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class THREE_SUM_15
{
    static List<List<Integer>> threeSum(int[] arr)
    {
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-2;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            int left=i+1;
            int rgt=n-1;
            while(left<rgt)
            {
                int sum=arr[i]+arr[left]+arr[rgt];
                if(sum==0)
                {
                    ans.add(Arrays.asList(arr[i],arr[left],arr[rgt]));
                    left++;
                    rgt--;
                    while (left<rgt && arr[left]==arr[left-1])
                    {
                        left++;
                    }
                    while(left<rgt && arr[rgt]==arr[rgt-1])
                    {
                        rgt--;
                    }
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    rgt--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(threeSum(arr));
    }
}
