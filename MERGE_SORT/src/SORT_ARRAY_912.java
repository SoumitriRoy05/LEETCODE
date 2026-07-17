import java.util.Arrays;
import java.util.Scanner;

public class SORT_ARRAY_912
{
    static int[] sort(int [] arr)
    {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }
    static void mergeSort(int[] arr,int left, int right)
    {
        if(left>=right)
        {
            return;
        }
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    static void merge(int[] arr, int left, int mid,int rgt)
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
        while(i<n1 && j<n2)
        {
            if(leftArr[i]<=rgtArr[j])
            {
                arr[k++]=leftArr[i++];
            }
            else
            {
                arr[k++]=rgtArr[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=leftArr[i++];
        }
        while(j<n2)
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
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
