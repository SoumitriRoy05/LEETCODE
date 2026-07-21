import java.util.Arrays;
import java.util.Scanner;

public class QUICK_SORT
{
    static int partition(int[] arr, int left, int right)
    {
        int pivot=arr[right];
        int i=left-1;
        for(int j=left;j<right;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;
        return i+1;
    }
    static void sort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int p1=partition(arr,low,high);
            sort(arr,low,p1-1);
            sort(arr,p1+1,high);
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
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
