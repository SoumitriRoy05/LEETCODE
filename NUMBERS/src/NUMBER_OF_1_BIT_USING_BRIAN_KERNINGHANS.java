import java.util.Scanner;

public class NUMBER_OF_1_BIT_USING_BRIAN_KERNINGHANS
{
    static int bits(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(bits(n));
    }
}
