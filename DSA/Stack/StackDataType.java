import java.util.Stack;
public class StackDataType {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(3);
        st.push(4);
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
    }
}
