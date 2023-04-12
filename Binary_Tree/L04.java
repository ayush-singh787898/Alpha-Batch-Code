
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;
import javax.xml.crypto.Data;
// public class L02_Implementation_of_Tree_LevelWise_Using_Queue {
    public class L04 {
    Node root;
    private static class Node{
        Node left,right;
        int data;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    public Node add(int[]arr,int i){
        Node root=null;
        if(i<arr.length){
            root=new Node(arr[i]);
            root.left=add(arr,2*i+1);
            root.right=add(arr,2*i+1);
        }
        return root;
    }



public void inorderWithoutRecursion(){
    Stack <TreeNode>s=new Stack<>();
    TreeNode c=root;
    Boolean f=true;
    while(f){
        if(c!=null){
            s.push(c);
            System.out.println(c.data+"->");
            c=c.left;
        }
        else{
            if(s.empty()){
                f=false;
            }
            else{
                c=s.pop();
                c=c.right;
            }
        }
    }
    
}





    // public void addInLavel(int data){
    //     Node p=new Node(data);
    //     if(root==null){
    //         root=p;
    //         return;
    //     }
    //     Queue<Node>q=new LinkedList<>();
    //     Node c=root;
    //     q.offer(c);
    //     boolean f=true;
    //     while
    //     (f){
    //         c=q.poll();
    //         if(c.left==null){
    //             c.left=p;
    //             return;
    //         }
    //         else if(c.right==null){
    //             c.right=p;
    //             return;
    //         }
    //         else{
    //             if(c.left!=null){
    //                 q.offer(c.left);

    //             }
    //             if(c.right!=null){
    //                 q.offer(c.right);
    //             }
    //         }
    //     }
    // }
    public static void preeOrder(Node p){
        if(p!=null){
            System.out.println(p.data+" ");
            inOrder(p.left);
            inOrder(p.right);

        }
    }
    public static void postOrder(Node p){
        if(p!=null){
            inOrder(p.left);
            inOrder(p.right);
            System.out.println(p.data+" ");

        }
    }
    public static void inOrder(Node p){
        if(p!=null){
            inOrder(p.left);
            System.out.println(p.data+" ");
            inOrder(p.right);
        }
    }
    public static void main(String[] args) {
        Implementation_of_Tree_LevelWise_Using_Queue t=new Implementation_of_Tree_LevelWise_Using_Queue();
        // t.add(10);
        // t.add(20);
        // t.add(30);
        // t.add(40);
        // t.add(50);
        // t.add(60);
        // inOrder(t.root);
        // preeOrder(t.root);
        int[] arr={1,21,32,45,52,55,35};
        for(int i=0;i<arr.length;i++){
            // t.addInLavel(arr[i]);
            t.add(arr[i]);
            
        }
        t.preeOrder(t.root);

        
    }
    
}
