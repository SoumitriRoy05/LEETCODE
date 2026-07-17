import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PERMUTATIONS_46
{
    static List<List<Integer>> permutation(int[] arr)
    {
        boolean[] used=new boolean[arr.length];
        List<List<Integer>> res=new ArrayList<>();
        backtrack(arr,used,new ArrayList<>(),res);
        return res;
    }
    private static void backtrack(int[] arr, boolean[] used,List<Integer> curr, List<List<Integer>> res)
    {
        if(curr.size()==arr.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            used[i]=true;
            curr.add(arr[i]);
            backtrack(arr,used,curr,res);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> res=permutation(arr);
        System.out.println(res);
    }
}
