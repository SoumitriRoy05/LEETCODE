    import java.util.Scanner;

    public class LONGEST_COMMON_PREFIX
    {
        static String longestCommonPrefix(String[] s)
        {
            if(s.length==0||s==null)
            {
                return "";
            }
            String prefix=s[0];
            for(int i=1;i<s.length;i++)
            {
                while(s[i].indexOf(prefix)!=0)
                {
                    prefix=prefix.substring(0,prefix.length()-1);
                    if(prefix.isEmpty())
                    {
                        return "";
                    }
                }
            }
            return prefix;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String[] s=new String[n];
            for(int i=0;i<n;i++)
            {
                s[i]=sc.next();
            }
            System.out.println(longestCommonPrefix(s));
        }
    }
