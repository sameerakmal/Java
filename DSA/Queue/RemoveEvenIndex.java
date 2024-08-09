import java.util.*;
import java.util.Queue;

public class RemoveEvenIndex {
    public static void main(String[] args) {
        Queue<Integer> que= new LinkedList<>();
        Queue<Integer> newque= new LinkedList<>();


        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);


        while (!que.isEmpty()) {
            que.remove();
            if(!que.isEmpty()) {
                newque.add(que.remove());
            }
        }
        System.out.println(newque);
    }
}
