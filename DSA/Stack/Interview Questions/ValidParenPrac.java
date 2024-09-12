import java.util.Stack;
public class ValidParenPrac {
    public boolean isValid(String s){
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
    public static void main(String[] args) {
        String s = "()[{}";
        ValidParenPrac vp = new ValidParenPrac();
        System.out.println(vp.isValid(s));
    }
}
