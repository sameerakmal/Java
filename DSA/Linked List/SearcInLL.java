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
public class SearcInLL {
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int SearchInLL(Node head, int val){
        Node temp = head;
        while (temp != null) {
            if(temp.data == val){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr = {5,6,7,4,6};
        int val = 8;
        Node head = convertArr2LL(arr);
        int ans = SearchInLL(head,val);
        System.out.print(ans);
        
        


    }
}
