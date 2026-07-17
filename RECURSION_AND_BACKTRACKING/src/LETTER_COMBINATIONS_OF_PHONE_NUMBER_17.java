import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LETTER_COMBINATIONS_OF_PHONE_NUMBER_17
{
    static String[] words=
    {
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public static List<String> letterCombinations(String s)
    {
        List<String > res=new ArrayList<>();
        if(s.length()==0)
        {
            return res;
        }
        backtrack(s,0,new StringBuilder(),res);
        return res;
    }
    private static void backtrack(String s, int idx, StringBuilder curr, List<String> res)
    {
        if(idx==s.length())
        {
            res.add(curr.toString());
            return;
        }
        String letter=words[s.charAt(idx)-'0'];
        for(char ch:letter.toCharArray())
        {
            curr.append(ch);
            backtrack(s,idx+1,curr,res);
            curr.deleteCharAt(curr.length()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<String> res=letterCombinations(s);
        System.out.println(res);
    }
}
