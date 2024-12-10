
import java.util.Stack;

public class Valid_Parentheses_20 {
    public static void main(String[] args) {
        String s = "()[{}]";
        System.out.println(isValid(s));
    }


    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') st.push(')');
            else if(c == '{') st.push('}');
            else if(c == '[') st.push(']');
            else if(st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
}
