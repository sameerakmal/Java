import java.util.Stack;
class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<Character>();

        for(char c : s.toCharArray()){
            if(c == '(')
            st.push(')');
            else if(c == '[')
            st.push(']');
            else if(c == '{')
            st.push('}');
            else if(st.isEmpty() || st.pop() != c)
            return false;
        }
        return st.isEmpty();
    }
}
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[{}";
        Solution sol = new Solution();
        System.out.println(sol.isValid(s));
    }
}
