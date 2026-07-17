import java.util.*;
public class REMOVE_DUPLICATE_FROM_SORTED_ARRAY_26_ARRAY
{
    static int duplicate(int[] arr)
    {
        if(arr.length==0)
        {
            return 0;
        }
        int i=0;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
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
