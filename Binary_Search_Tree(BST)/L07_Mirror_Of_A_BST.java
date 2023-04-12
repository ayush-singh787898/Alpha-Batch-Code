
public class L07_Mirror_Of_A_BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node createMirror(Node root){         // Time complexity O(n);
        if(root==null){
            return null;
        }
        Node leftMirror=createMirror(root.left);
        Node rightMirror=createMirror(root.right);
        // swapping steps
        root.left=rightMirror;
        root.right=leftMirror;
        return root;

    }
        // preorder to check answer is correct or not
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        /*
        Input
                    8
                  /   \
                 5     10
                / \      \
               3    6     11




         */
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);


        root=createMirror(root);
        preorder(root);



        // Output
/*
                    8
                  /   \
                 10    5
                /     / \
               11    6   3




*/
    }
    
}
