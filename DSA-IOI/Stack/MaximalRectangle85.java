import java.util.*;

public class MaximalRectangle85 {
    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        MaximalRectangle85 solution = new MaximalRectangle85();
        int area = solution.maximalRectangle(matrix);
        System.out.println("The maximal rectangle area is: " + area);
    }

    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = (matrix[i][j] == '1') ? 1 : 0;
            }
        }
        for (int j = 0; j < m; j++) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (mat[i][j] == 0) cnt = 0;
                else {
                    cnt++;
                    mat[i][j] = cnt;
                }
            }
        }
        int area = 0;
        for (int i = 0; i < n; i++) {
            area = Math.max(area, largestRectangleArea(mat[i]));
        }
        return area;
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
