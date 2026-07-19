import java.util.Scanner;

public class JUMP_GAME_II
{
    public static int jump(int[] arr)
    {
        int jump=0;
        int end=0;
        int farthest=0;
        for(int i=0;i<arr.length-1;i++)
        {
            farthest=Math.max(farthest,i+arr[i]);
            if(i==end)
            {
                jump++;
                end=farthest;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(jump(arr));
    }
}
