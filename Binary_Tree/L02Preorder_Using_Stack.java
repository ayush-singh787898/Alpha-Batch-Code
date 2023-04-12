import java.util.*;
public  class L02Preorder_Using_Stack {
    public static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
        public static ArrayList<Integer>preOrderIterative(Node node){
            ArrayList<Integer> al=new ArrayList<Integer>();
            Stack<Node>s=new Stack<>();
            s.push(node);
            while(!s.isEmpty()){
                Node n=s.pop();
                // System.out.println("Node"+n.data);
                al.add(n.data);
                // System.out.println(al);
                
                if(n.right!=null){
                    s.push(n.right);
                }
                if(n.left!=null){
                    s.push(n.left);
                }
            }
            return al;
        }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=null;
        root.right.left=new Node(9);
        root.right.right=new Node(10);
        System.out.println(preOrderIterative(root));

        
        
    }
    
}
