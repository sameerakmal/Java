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

public class DeleteNode {
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

    private static Node removeHead(Node head)
    {
        if (head == null) return head;
        head = head.next;
        return head;
    }  


    
    private static Node removeTail(Node head){
        if(head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node removeK(Node head, int k){
        if(head == null) return head;
        if(k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            cnt++;
            if(cnt == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }


    private static Node removeEl(Node head, int el){
        if(head == null) return head;
        if(el == head.data) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == el){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }


    private static void printLL(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            
        }
        System.out.println();
    } 
        public static void main(String[] args) {
        int[] arr = {9,8,7,6,5};
        int k = 5;
        int el = 7;
        Node head = convertArr2LL(arr);
        // head = removeHead(head);
        // head = removeTail(head);
        // head = removeK(head, k);
        head = removeEl(head, el);


        printLL(head);
        
    }
}
