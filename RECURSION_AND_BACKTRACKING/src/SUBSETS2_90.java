import java.lang.reflect.Array;
import java.util.*;
public class SUBSETS2_90
{
    static List<List<Integer>> subsets(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        backtrack(arr,0,new ArrayList<>(), res);
        return res;
    }
    private static void backtrack(int[] arr,  int start, List<Integer> curr, List<List<Integer>> res)
    {
        res.add(new ArrayList<>(curr));
        for(int i=start;i<arr.length;i++)
        {
            if(i>start && arr[i]==arr[i-1])
            {
                continue;
            }
            curr.add(arr[i]);
            backtrack(arr,i+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> res=subsets(arr);
        System.out.println(res);
    }
}
