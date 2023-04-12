import java.util.*;
public class Left_Left_Node_Sum {
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
    public static int sumLeftLeafNode(Node root){
        if(root==null){
            return 0;
        }
        Stack<Node>stk=new Stack<>();
        stk.push(root);
        int sum=0;
        while(!stk.isEmpty()){
            Node n=stk.pop();
            if(n.left!=null){
                if(n.left.left==null && n.left.right==null){
                    sum+=n.left.data;
                }
                else{
                    stk.push(n.left);
                }

            }
            if(n.right!=null){
                if(n.right.left!=null || n.right.right!=null){
                    stk.push(n.right);
                }
            }
        }
        return sum;


    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(7);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.left.right.left=new Node(6);
        root.right.left=new Node(8);
        root.right.right=new Node(5);
        System.out.println(sumLeftLeafNode(root));
        
    }
    
}
