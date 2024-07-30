import java.util.Stack;
public class CopyStIntoAnotherSt {
    public static void main(String[] args) {
        Stack <Integer> st_original = new Stack <>();
        st_original.push(5);
        st_original.push(7);
        st_original.push(9);
        st_original.push(10);
        System.out.println(st_original);

        Stack <Integer> st_temp = new Stack <>();
        while (!st_original.isEmpty()) {
            st_temp.push(st_original.pop());
        }
        System.out.println(st_temp);


        Stack <Integer> st_duplicate = new Stack<>();
        while (!st_temp.isEmpty()) {
            st_duplicate.push(st_temp.pop());
        }
        System.out.println(st_duplicate);

    }
}
// TC : O(N) + O(N) + O(N) = O(N)
// SC : O(N) + O(N) = O(N) 
