import java.util.HashSet;
import java.util.Scanner;

public class FIND_DUPLICATE_NUMBER_287
{
    static int duplicate(int[] arr)
    {
        HashSet<Integer> mpp=new HashSet<>();
        for(int x:arr)
        {
            if(mpp.contains(x))
            {
                return x;
            }
            mpp.add(x);
        }
        return -1;
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
