import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class COMBINATION_SUM_39
{
    static List<List<Integer>> combination(int[] candidate, int target)
    {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(candidate,target,0,new ArrayList<>(),res);
        return res;
    }
    private static void backtrack(int[] candidate,int target, int start, List<Integer> curr, List<List<Integer>> res )
    {
        if(target==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i=start;i<candidate.length;i++)
        {
            curr.add(candidate[i]);
            backtrack(candidate,target-candidate[i],i,curr,res);
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
        int target=sc.nextInt();
        List<List<Integer>> res=combination(arr,target);
        System.out.println(res);
    }
}
