import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GENERATE_PARENTHESIS
{
    public List<String> generate(int n)
    {
        List<String> res=new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }
    private void backtrack(List<String> res, String curr,int open, int close, int max)
    {
        if(curr.length()==2*max)
        {
            res.add(curr);
            return;
        }
        if(open<max)
        {
            backtrack(res,curr+"(",open+1,close,max);
        }
        if(close<open)
        {
            backtrack(res,curr+")",open,close+1,max);
        }
    }

    public static void main(String[] args) {
        GENERATE_PARENTHESIS obj=new GENERATE_PARENTHESIS();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(obj.generate(n));
    }
}
