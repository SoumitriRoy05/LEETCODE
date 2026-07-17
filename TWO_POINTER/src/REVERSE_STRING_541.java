import java.util.Scanner;

public class REVERSE_STRING_541
{
    static String reverse(String s, int k)
    {
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k)
        {
            int left=i;
            int rgt=Math.min(i+k-1,ch.length-1);
            while(left<rgt)
            {
                char temp=ch[left];
                ch[left]=ch[rgt];
                ch[rgt]=temp;
                left++;
                rgt--;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k= sc.nextInt();
        System.out.println(reverse(s,k));
    }
}
