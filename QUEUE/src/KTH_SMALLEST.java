import java.util.PriorityQueue;
import java.util.Scanner;

public class KTH_SMALLEST
{
    static int smallest(int[] arr,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:arr)
        {
            pq.offer(x);
        }
        for(int i=1;i<k;i++)
        {
            pq.poll();
        }
        return pq.peek();
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
        System.out.println(smallest(arr,k));
    }
}
