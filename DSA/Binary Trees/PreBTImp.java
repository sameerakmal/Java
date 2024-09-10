import java.util.LinkedList;
import java.util.Queue;

public class PreBTImp {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }  
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static int sumNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = sumNodes(root.left);
        int rightNodes = sumNodes(root.right);
        return leftNodes + rightNodes + root.data;
    }

    public static int heightTree(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = heightTree(root.left);
        int rightNodes = heightTree(root.right);
        
        int myHeight = Math.max(leftNodes, rightNodes) + 1;
        return myHeight;
    }

    static class TreeInfo{
        int height;
        int diam;

        TreeInfo(int ht, int diam){
            this.height = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);
 
 
        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;
 
 
        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;
 
 
        int myDiam = Math.max(diam1, Math.max(diam2, diam3));
 
 
        return new TreeInfo(myHeight, myDiam);
    }

    public boolean isIdentical(Node root,Node subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }
   
    public boolean isSubtree(Node root, Node subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
 
 
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new  BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preOrder(root);
        
        System.out.println(heightTree(root));
        System.out.println(diameter(root).diam);
    }
}
