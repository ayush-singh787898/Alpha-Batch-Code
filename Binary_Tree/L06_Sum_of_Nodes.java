

public class L06_Sum_of_Nodes {
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
    // public static int count(Node root){
    //     if(root==null){
    //         return 0;

    //     }
    //     // int leftCount=count(root.left);
    //     // int rightCount=count(root.right);
    //     // return leftCount+rightCount+1;
        
    //     // or
    //     return count(root.left)+count(root.right)+1;
    // }
    public static int sum_Of_Nodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum_Of_Nodes(root.left);
        int rightSum=sum_Of_Nodes(root.right);
        return leftSum+rightSum+root.data;

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
        // System.out.println("height of tree is: "+height(root));
        // System.out.println("No of Node in tree :"+(count(root)));
        System.out.println(sum_Of_Nodes(root));
        
    }
    
}
