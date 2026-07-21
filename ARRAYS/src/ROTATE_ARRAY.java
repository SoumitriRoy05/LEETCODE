import java.util.Arrays;
import java.util.Scanner;

public class ROTATE_ARRAY
{
    static void rotate(int[] arr, int left, int right)
    {
        while(left<=right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    static void rotateArray(int[] arr, int k)
    {
        k=k%arr.length;
        rotate(arr,0,arr.length-1);
        rotate(arr,0,k-1);
        rotate(arr,k, arr.length-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotateArray(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
