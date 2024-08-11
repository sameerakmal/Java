class Queue{
    private int f,r,size;
    private int[] arr;

    public Queue(){
        f = -1;
        r = -1;
        arr = new int[5];
    }

    public void add(int x){
        if(r == arr.length-1){
            System.out.println("Queue is full");
            return;
        }
        else if(f == -1 && r == -1){
            f = 0;
            r = 0;
            arr[r] = x;
        }
        else{
            arr[++r] = x;
        }
        size++;
    }

    public int remove(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int x = arr[f++];
            size--;
            return x;
        } 
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[f];
    }

    public boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }

    public void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = f;i <= r;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size(){
        return size;
    }

}
public class QueueUsingArr{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.display();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        

    }
}