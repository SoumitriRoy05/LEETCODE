import java.util.Scanner;

public class EDIT_DISTANCE
{
    static int distance(String s, String t)
    {
        int[][] dp=new int[s.length()+1][t.length()+1];
//        DELETE ALL CHARACTERS
        for(int i=0;i<=s.length();i++)
        {
            dp[i][0]=i;
        }
//        DELETE ALL CHARACTERS
        for(int j=0;j<=t.length();j++)
        {
            dp[0][j]=j;
        }
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=t.length();j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+Math.min(dp[i-1][j],  //DELETE
                            Math.min(dp[i][j-1],    //INSERT
                                    dp[i-1][j-1])  //REPLACE
                    );
                }
            }
        }
        return dp[s.length()][t.length()];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(distance(s,t));
    }
}
