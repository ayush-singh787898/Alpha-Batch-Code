import java.util.LinkedList;
import java.util.Queue;
public class Implementation_of_Tree_LevelWise_Using_Queue {
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
    public void addInLavel(int data){
        Node p=new Node(data);
        if(root==null){
            root=p;
            return;
        }
        Queue<Node>q=new LinkedList<>();
        Node c=root;
        q.offer(c);
        boolean f=true;
        while
        (f){
            c=q.poll();
            if(c.left==null){
                c.left=p;
                return;
            }
            else if(c.right==null){
                c.right=p;
                return;
            }
            else{
                if(c.left!=null){
                    q.offer(c.left);

                }
                if(c.right!=null){
                    q.offer(c.right);
                }
            }
        }
    }
    public static void preeOrder(Node p){
        if(p!=null){
            System.out.println(p.data+" ");
            inOrder(p.left);
            inOrder(p.right);

        }
    }
    public static void postOrder(Node p){
        if(p!=null){
            postOrder(p.left);
            postOrder(p.right);
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
        t.addInLavel(10);
        t.addInLavel(20);
        t.addInLavel(30);
        t.addInLavel(40);
        t.addInLavel(50);
        t.addInLavel(60);
        // inOrder(t.root);
        preeOrder(t.root);

        
    }
    
}
