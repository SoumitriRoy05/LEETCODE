import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MERGE_SORT
{
    static void merge(int[] arr, int left, int rgt)
    {
        if(left>=rgt)
        {
            return;
        }
        int mid=left+(rgt-left)/2;
        merge(arr,left,mid);
        merge(arr,mid+1,rgt);
        mergeSort(arr,left,mid,rgt);
    }
    static void mergeSort(int[] arr, int left, int mid, int rgt)
    {
        int n1=mid-left+1;
        int n2=rgt-mid;
        int[] leftArr=new int[n1];
        int[] rgtArr=new int[n2];
        for(int i=0;i<n1;i++)
        {
            leftArr[i]=arr[left+i];
        }
        for(int i=0;i<n2;i++)
        {
            rgtArr[i]=arr[mid+1+i];
        }
        int i=0, j=0, k=left;
        while(i<n1 && j<n2) {
            if (leftArr[i] <= rgtArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rgtArr[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=leftArr[i++];
        }
        while (j<n2)
        {
            arr[k++]=rgtArr[j++];
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
        merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
