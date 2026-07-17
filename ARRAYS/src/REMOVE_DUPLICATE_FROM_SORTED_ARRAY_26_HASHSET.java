import java.util.HashSet;
import java.util.Scanner;

public class REMOVE_DUPLICATE_FROM_SORTED_ARRAY_26_HASHSET
{
    static int duplicate(int[] arr)
    {
        HashSet<Integer> set=new HashSet<>();
        int idx=0;
        for(int x:arr)
        {
            if(!set.contains(x))
            {
                set.add(x);
                arr[idx++]=x;
            }
        }
        return idx;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(duplicate(arr));
    }
}
