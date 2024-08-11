class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class QueueUsingLL {
    int size = 0;
    Node head = null;
    Node tail = null;
    public void add(int x){
        Node temp = new Node(x);
        if(size == 0){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int peek(){
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return head.data;
        }
    }

    public int remove(){
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }
        else return false;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.display();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
