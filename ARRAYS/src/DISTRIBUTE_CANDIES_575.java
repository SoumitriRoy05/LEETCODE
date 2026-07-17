import java.util.HashSet;
import java.util.Scanner;

public class DISTRIBUTE_CANDIES_575
{
    static int candies(int[] nums)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        return Math.min(set.size(),nums.length/2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(candies(arr));
    }
}
