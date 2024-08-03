import java.util.Stack;
public class ReverseStackRecursively {

    public static void displayReverse(Stack<Integer> st){
        if (st.isEmpty()) 
        return;
        int top = st.pop();
        // System.out.println(top); // To display in reverse
        displayReverse(st);
        System.out.println(top); // To display in same order.
        st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(10);
        displayReverse(st);
    }
}