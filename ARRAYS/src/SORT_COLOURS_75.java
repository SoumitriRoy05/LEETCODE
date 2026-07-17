import java.util.Arrays;
import java.util.Scanner;

public class SORT_COLOURS_75
{
    static void sort(int[] arr)
    {
        int zero=0, one=0, two=0;
        for(int x:arr)
        {
            if(x==0)
            {
                zero++;
            }
            else if(x==1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        int idx=0;
        while(zero-->0)
        {
            arr[idx++]=0;
        }while(one-->0)
        {
            arr[idx++]=1;
        }while(two-->0)
        {
            arr[idx++]=2;
        }
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
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
