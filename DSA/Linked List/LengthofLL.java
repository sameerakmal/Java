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
public class LengthofLL {
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int lengthofLL(Node head){
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {7,5,6,7,5,6};
        Node head = convertArr2LL(arr);
        System.out.print(lengthofLL(head));
    }

}
