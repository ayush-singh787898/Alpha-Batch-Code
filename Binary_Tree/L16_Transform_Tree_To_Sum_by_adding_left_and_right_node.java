


//    In this problem we create a new tree from previous tree by adding left and right node = parent node of previous tree.


public class L16_Transform_Tree_To_Sum_by_adding_left_and_right_node{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    


    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftChild=transform(root.left);
        int rightChild=transform(root.right);
        int data=root.data;
        int newLeft=root.left==null?0:root.left.data;       // when we talk about leaf node
        int newRight=root.right==null?0:root.right.data;       // at leaf node
        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }


    public static void main(String[] args) {
       // Initial Tree
 /*
          1
        /   \
      2      3   
    /  \    /  \
   4    5  6     7
         
*/

    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

    transform(root);
    preorder(root);
        //  expected sum tree is:
 /*
          27
        /   \
      9      13   
    /  \    /  \
   0    0  0     0
         
*/

    }
}