
import java.util.Stack;

public class MinRemoveToMakeValid {
    public static void main(String[] args) {
        String input = "))((";
        Solution solution = new Solution();
        String result = solution.minRemoveToMakeValid(input);
        System.out.println(result);
    }
}

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!st.isEmpty() && st.peek().ch == '(' && c == ')') {
                st.pop();
            } else if(s.charAt(i) == '(' || s.charAt(i) == ')') {
                st.push(new Pair(c, i));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!st.isEmpty() && st.peek().idx == i) {
                st.pop();
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.reverse().toString();
    }

    private static class Pair {
        char ch;
        int idx;

        Pair(char ch, int idx) {
            this.ch = ch;
            this.idx = idx;
        }
    }
}
