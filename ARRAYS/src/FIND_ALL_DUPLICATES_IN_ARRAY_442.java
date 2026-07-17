import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FIND_ALL_DUPLICATES_IN_ARRAY_442 {
    static List<Integer> dupliacte(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int x : arr) {
            if (set.contains(x)) {
                ans.add(x);
            } else {
                set.add(x);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(dupliacte(arr));
    }
}
