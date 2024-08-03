import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        Solution sol = new Solution();
        System.out.println(sol.removeDuplicates(s));
    }
}
