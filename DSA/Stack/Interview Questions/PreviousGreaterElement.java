import java.util.Arrays;
import java.util.Stack;
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] PreviousLargerElement(long[] arr, int n)
    { 
        long[] output = new long[n];
        output[0] = -1;
        
        Stack<Long> st = new Stack<>();
        st.push(arr[0]);
        
        for(int i = 1; i <=n-1; i++){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            output[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return output;
        
    } 
}
public class PreviousGreaterElement {
    public static void main(String[] args) {
        long[] arr = {6,8,0,1,3};
        long[] output = Solution.PreviousLargerElement(arr, 5);
        System.out.println(Arrays.toString(output));
    }
}
