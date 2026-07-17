import java.util.Scanner;

public class CONTAINER_WITH_MOST_WATER_11
{
    static int container(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        int max=0;
        while(left<right)
        {
            int width=right-left;
            int min=Math.min(arr[left], arr[right]);
            int area=width*min;
            max=Math.max(area,max);
            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(container(arr));
    }
}
