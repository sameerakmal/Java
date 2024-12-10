import java.util.*;

public class Left_Smaller_Elements {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 10, 2, 5};
        int n = arr.length;
        System.out.println(leftSmaller(n, arr));
    }

    static List<Integer> leftSmaller(int n, int arr[]) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.size() > 0) {
                ans.add(st.peek());
            } else {
                ans.add(-1);
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
