import java.util.Arrays;
import java.util.Stack;
class Solution {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int[] leftsmall = new int[n];
        int[] rightsmall = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()) leftsmall[i] = 0;
            else
            leftsmall[i] = st.peek() + 1;

            st.push(i);
        }

        while(!st.isEmpty()) st.pop();

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()) rightsmall[i] = n-1;
            else
            rightsmall[i] = st.peek() - 1;

            st.push(i);
        }

        int maxA = 0;
        for(int i = 0; i < n; i++){
            maxA = Math.max(maxA, heights[i] * (rightsmall[i] - leftsmall[i] + 1));
        }
        return maxA;
    }
}
public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3,1};
        int max = Solution.largestRectangleArea(heights);
        System.out.println(max);
    }
}
