import java.util.Stack;
public class InsertionAtBottom {
    public static void main(String[] args) {
        Stack <Integer> st_original = new Stack<>();
        st_original.push(5);
        st_original.push(7);
        st_original.push(9);
        st_original.push(10);
        System.out.println(st_original);
        int x = 3;

        Stack <Integer> st_temp = new Stack<>();
        while (!st_original.isEmpty()) {
            st_temp.push(st_original.pop());
        }
        System.out.println(st_temp);

        st_original.push(x);
        System.out.println(st_original);

        while (!st_temp.isEmpty()) {
            st_original.push(st_temp.pop());
        }
        System.out.println(st_original);
    }
}
// TC : O(N)
// SC : O(N)
