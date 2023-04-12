
public class L04_Height_Of_Tree {
    public static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
        public static int height(Node node){
            if(node==null){
                return 0;
            }
            return 1+Math.max(height(node.left),height(node.right));
        }
    public static void main(String[] args) {

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
        // System.out.println(root.Binary_Tree);
        System.out.println("height of tree is: "+height(root));
        
    }
    
}
