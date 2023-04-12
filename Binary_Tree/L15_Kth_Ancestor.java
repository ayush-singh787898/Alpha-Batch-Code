
public class L15_Kth_Ancestor{
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
    
    public static int kthAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDistance=kthAncestor(root.left, n, k);
        int righDistance=kthAncestor(root.right, n, k);
        if(leftDistance==-1 && righDistance==-1){
            return -1;
        }
        int max=Math.max(leftDistance,righDistance);
        if(max+1==k){
            System.out.println(root.data);

        }
        return max+1;

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
    int n=5,k=2;
    kthAncestor(root, n, k);            //  node 5 ke liye 2nd ancestor ?

    }
}