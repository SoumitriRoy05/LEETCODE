import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PASCAL_TRIANGLE
{
    static List<List<Integer>> pascal(int rows)
    {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<rows;i++)
        {
            long val=1;
            List<Integer> ans=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                ans.add((int) val);
                val=val*(i-j)/(j+1);
            }
            list.add(ans);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> ans=pascal(n);
        System.out.println(ans.toString());
    }
}
