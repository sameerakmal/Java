import java.util.*;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        LargestRectangleInHistogram solution = new LargestRectangleInHistogram();
        int maxArea = solution.largestRectangleArea(heights);
        System.out.println("The largest rectangle area is: " + maxArea);
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nls = new int[n];
        int[] nrs = new int[n];
        Stack<Integer> st = new Stack<>(); 
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                nls[i] = st.peek();
            } else {
                nls[i] = -1;
            }
            st.push(i);
        }
        st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                nrs[i] = st.peek();
            } else {
                nrs[i] = n;
            }
            st.push(i);
        }
        int maxAr = 0;
        for (int i = 0; i < n; i++) {
            int width = nrs[i] - nls[i] - 1;
            maxAr = Math.max(maxAr, width * heights[i]);
        }
        return maxAr;
    }
}
