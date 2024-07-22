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
public class LLprac{
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

    private static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static int lengthInLL(Node head){
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    private static int searchInLL(Node head, int k){
        Node temp = head;
        
        while (temp != null) {
            if(k == temp.data){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }



    public static void main(String[] args) {
        int cnt = 0;
        int k = 7;
        int[] arr = {1,2,3,4,5};
        Node head = convertArr2LL(arr);
        cnt = lengthInLL(head);
        int ans = searchInLL(head, k);
        System.out.println(ans);
        System.out.println(cnt);
        print(head);
    }
}