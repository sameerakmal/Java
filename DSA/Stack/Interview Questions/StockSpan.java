import java.util.Arrays;
import java.util.Stack;
class Solution{
    public static int[] CalculateSpan(int price[], int n){
        int[] arr = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && price[i] >= price[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arr[i] = i + 1;
            }
            else{
                arr[i] = i - st.peek();
            }
            st.push(i);
        }
        return arr;
    }
}
public class StockSpan {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] arr = Solution.CalculateSpan(price, 7);
        System.out.println(Arrays.toString(arr));
    }
}
