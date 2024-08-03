import java.util.Arrays;
import java.util.Stack;
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] output = new long[n];
        output[n-1] = -1;
        
        Stack<Long> st = new Stack<>();
        st.push(arr[n-1]);
        
        for(int i = n-2; i >=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            output[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return output;
        
    } 
}
public class NextGreaterElement {
    public static void main(String[] args) {
        long[] arr = {6,8,0,1,3};
        long[] output = Solution.nextLargerElement(arr, 5);
        System.out.println(Arrays.toString(output));
    }
}
