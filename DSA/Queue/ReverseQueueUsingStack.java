import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ReverseQueueUsingStack {

    public static void main(String[] args) {

        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);

        while (!que.isEmpty()) {
            stack.push(que.remove());
        }
        while (!stack.isEmpty()) {
            que.add(stack.pop());
        }
        System.out.println(que);
}
}
