import java.util.Stack;
class ReverseStack{
    public static void main(String[] args) {
        Stack <Integer> st_original = new Stack<>();
        st_original.push(5);
        st_original.push(7);
        st_original.push(9);
        st_original.push(10);
        System.out.println(st_original);

        Stack <Integer> st_reversed = new Stack<>();
        while (!st_original.isEmpty()) {

            // int element = st_original.pop();
            // st_reversed.push(element);
            
            st_reversed.push(st_original.pop());
        }
        System.out.println(st_reversed);

    }
}