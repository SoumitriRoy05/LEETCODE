import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PRODUCT_ARRAY_EXCEPT_SELF
{
    static int[] product(int[] arr)
    {
        int[] prefix=new int[arr.length];
        prefix[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        int suffix=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            prefix[i]*=suffix;
            suffix*=arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=product(arr);
        System.out.println(Arrays.toString(ans));
    }
}
