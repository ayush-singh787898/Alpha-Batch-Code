import java.util.*;
public class L03_Level_Order {
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
    public static class Binary_Tree{
     static int indx=-1;
        public static Node buildTree(int node[]){
            indx =indx+1;
            if(node[indx]==-1){
                return null;
            }
            Node newNode=new Node(node[indx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;
        }

        // Level Order Traversal
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);    // for next line null is added
            while(!q.isEmpty()){
                Node currNode=q.remove();       // currentNode is being removed one-by one
                if(currNode==null){
                    System.out.println();   // next line printed
                    if(q.isEmpty()){
                        break;
                    }
                    else{           // if element is present add in the queue
                        q.add(null);        // null is added in queue.
                    }


                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
              
            }
        }
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree tb=new Binary_Tree();


        Node root=tb.buildTree(node);
        tb.levelOrder(root);
        // System.out.println(root.data);
        
    }
    
}
