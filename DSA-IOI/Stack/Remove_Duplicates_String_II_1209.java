import java.util.*;

public class Remove_Duplicates_String_II_1209 {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(s, k)); // Example usage
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek().charac == c) {
                st.peek().cnt++;
                if (st.peek().cnt == k) {
                    st.pop();
                }
            } else {
                st.push(new Pair(c, 1));
            }
        }

        StringBuilder ans = new StringBuilder();
        for (Pair p : st) {
            ans.append(String.valueOf(p.charac).repeat(p.cnt));
        }
        return ans.toString();
    }

    private static class Pair {
        char charac;
        int cnt;

        Pair(char charac, int cnt) {
            this.charac = charac;
            this.cnt = cnt;
        }
    }
}
