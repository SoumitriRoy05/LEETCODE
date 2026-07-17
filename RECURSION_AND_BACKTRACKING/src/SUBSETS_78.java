import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SUBSETS_78
{
    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(arr,0,new ArrayList<>(),list);
        return list;
    }
    private static void backtrack(int[] arr, int start, List<Integer> curr, List<List<Integer>> res)
    {
        res.add(new ArrayList<>(curr));
        for(int i=start;i<arr.length;i++)
        {
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
        List<List<Integer>> res=subset(arr);
        System.out.println(res);
    }
}
