import java.util.Scanner;

public class FIND_FIRST_AND_LAST_POSITION_OF_ELEMENT_IN_SORTED_ARRAY_34
{
    public int firstPosition(int[] arr, int k)
    {
        int left=0;
        int right=arr.length-1;
        int ans=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==k)
            {
                ans=mid;
                right=mid-1;
            }
            else if(arr[mid]<k)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
    }
    public int lastPosition(int[] arr, int k)
    {
        int left=0;
        int right=arr.length-1;
        int ans=-1;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==k)
            {
                ans=mid;
                left=mid+1;
            }
            else if(arr[mid]<k)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
    }
    public int[] findRange(int[] arr, int k)
    {
        int first=firstPosition(arr,k);
        int last=lastPosition(arr,k);
        return new int[]{first,last};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        FIND_FIRST_AND_LAST_POSITION_OF_ELEMENT_IN_SORTED_ARRAY_34 obj=new FIND_FIRST_AND_LAST_POSITION_OF_ELEMENT_IN_SORTED_ARRAY_34();
        int[] res=obj.findRange(arr,k);
        System.out.println(res[0]+","+res[1]);
    }
}
