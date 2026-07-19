import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LAST_STONE_WEIGHT
{
    static int lastStone(int[] arr)
    {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:arr)
        {
            queue.offer(x);
        }
        while(queue.size()>1)
        {
            int first=queue.poll();
            int second=queue.poll();
            if(first!=second)
            {
                queue.offer(first-second);
            }
        }
        return queue.isEmpty()?0:queue.poll();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(lastStone(arr));
    }
}
