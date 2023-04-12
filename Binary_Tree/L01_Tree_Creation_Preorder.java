import java.util.*;
public class L01_Tree_Creation_Preorder{         // Time complexity will be O(n);
    static class Node{          // Node class
        int data;
        Node left;
        Node right;
        Node(int data){         //  Constructor of Node class
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }

    // Binary-Tree class
    static class BinaryTree{
        static int indx=-1;         // indx must be static b/c it will be update at each level
        public static Node buildTree(int nodes[]) {      // from here Node will return means we will return root of tree from here
        indx++;     // 1st index creation
        if(nodes[indx]==-1){
            return null;    // null is returned b/c there is no need to create left child and right child of null Node.
        }
        // if nodes[indx]!=-1 then create newnode
        Node newNode=new Node(nodes[indx]);
        newNode.left=buildTree(nodes);      // buildTree automatically provide left subTree . = sign is used for join the nodes
        newNode.right=buildTree(nodes);
        return newNode;


       }
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(node);     // node data is passed in buildTree
        System.out.println(root.data);
        
    }

}