import java.util.Scanner;

public class ARRAY_PARTITION_561
{
    static int partition(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i+=2)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(partition(arr));
    }
}
