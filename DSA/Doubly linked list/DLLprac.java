class Node{
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DLLprac {
    private static Node convertArr2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = prev.next;
        }
        return head;   
    }

    private static void printDLL(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node deleteAtHead(Node head){
        Node prev = head;
        if (head == null || head.next == null) {
            return null;
        }
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    private static Node deleteAtTail(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }

    private static Node deleteAtK(Node head, int k){
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if(prev == null && front == null){
            return null;
        }
        else if(prev == null){
            return deleteAtHead(head);
        }
        else if(front == null){
            return deleteAtTail(head);
        }
        prev.next = front;
        front.back = prev;

        temp.next = null;
        temp.back = null;

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArr2DLL(arr);
        head = deleteAtK(head, 3);
        printDLL(head);
    }
}
