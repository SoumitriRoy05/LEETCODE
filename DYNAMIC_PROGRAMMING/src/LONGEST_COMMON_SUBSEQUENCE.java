import java.util.Scanner;

public class LONGEST_COMMON_SUBSEQUENCE
{
static int longest(String s, String t)
{
    int[][] dp=new int[s.length()+1][t.length()+1];
    for(int i=1;i<=s.length();i++)
    {
        for(int j=1;j<=t.length();j++)
        {
            if(s.charAt(i-1)==t.charAt(j-1))
            {
                dp[i][j]=dp[i-1][j-1]+1;
            }
            else
            {
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    return dp[s.length()][t.length()];
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(longest(s,t));
    }
}
