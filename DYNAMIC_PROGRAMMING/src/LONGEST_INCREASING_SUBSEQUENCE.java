import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LONGEST_INCREASING_SUBSEQUENCE
{
    static int list(int[] arr)
    {
        List<Integer> res=new ArrayList<>();
        for(int x:arr)
        {
            int idx= Collections.binarySearch(res,x);
            if(idx<0)
            {
                idx=-(idx+1);
            }
            if(idx==res.size())
            {
                res.add(x);
            }
            else
            {
                res.set(idx,x);
            }
        }
        return res.size();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(list(arr));
    }
}
