import java.util.PriorityQueue;
import java.util.Scanner;

public class KTH_LARGEST_ELEMENT
{
    static int largest(int[] arr, int k)
    {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int x:arr)
        {
            queue.offer(x);
            if(queue.size()>k)
            {
                queue.poll();
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(largest(arr,k));
    }
}
