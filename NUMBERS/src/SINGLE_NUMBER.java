import java.util.Scanner;

public class SINGLE_NUMBER
{
    static int single(int[] arr)
    {
        int res=0;
        for(int x:arr)
        {
            res=res^x;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(single(arr));
    }
}
