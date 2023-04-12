import java.util.ArrayList;
import java.util.Stack;


import java.util.*;

public class L02_Inorder_Using_Stack {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
     
    }

    // public static List<Integer> inorderTraversal(Node root){

    //     List<Integer> ls=new ArrayList<>();
    //     inorder(root, ls);
    //     return ls;


    // }
    // public static void inorder(Node root,List<Integer> ls){
    //     if(root==null){
    //         return;
    //     }
    //     inorder(root.left,ls);
    //     ls.add(root.data);
    //     inorder(root.right, ls);

    // }
    public static ArrayList<Integer> inorderTraversal(Node root){
        ArrayList<Integer>al=new ArrayList<>();
        Stack<Node>stk=new Stack<>();
        stk.add(root);
        Node n=root;
        while(!stk.isEmpty()){
            if(n.left!=null){
                stk.push(n.left);
                n=n.left;
            }
            else{
                n=stk.pop();
                al.add(n.data);
                if(n.right!=null){
                    stk.push(n.right);
                    n=n.right;
                }
            }
        }
        return al;            
    }
    public static void main(String[] args) {
        // Node root=new Node(1);
        // root.left=new Node(2);
        // root.right=new Node(3);
        // root.left.left=new Node(5);
        // root.left.right=null;
        // root.right.left=new Node(9);
        // root.right.right=new Node(10);
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(6);
        root.right.left=new Node(9);
        root.right.right=new Node(10);
        
        System.out.println(inorderTraversal(root));
    }
}
