import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ReverseQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(5);
        que.add(4);
        que.add(3);
        que.add(2);
        que.add(1);
        System.out.println(que);
        Stack<Integer> st = new Stack<>();
        Queue<Integer> rQueue = new LinkedList<>();

        
        System.out.println(que);
        System.out.println(st);
        System.out.println(rQueue);

    }
}
