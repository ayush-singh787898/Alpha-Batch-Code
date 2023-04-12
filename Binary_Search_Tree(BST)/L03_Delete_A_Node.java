import javax.xml.crypto.Data;

public class L03_Delete_A_Node {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insertBST(Node root ,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            // left subTree
            root.left=insertBST(root.left, val);
        }
        if(root.data<val){
            // right SubTree
            root.right=insertBST(root.right, val);
        }
        return root;
    }
    public static Node deleteNode(Node root,int val){
        if(root.data<val){
            root.right=deleteNode(root.right, val);
        }
        else if(root.data>val){
            root.left=deleteNode(root.left, val);
        }
        else{       // root data ==val (voila)
            // case-1: when we are at leat node
            if(root.left==null && root.right==null){
                return null;
            }
            // case-2: single child exist
            if(root.left==null){        // when right child exist
                return root.right;
            }
            else if(root.right==null){      // when left child exist
                return root.left;
            }

            // case-3 : both children exist (Left and right)
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=deleteNode(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        
        return root;

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        int key=5;
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insertBST(root, values[i]);
        }
        inorder(root);
        System.out.println();
        root=deleteNode(root, 5 );       // 5 to be deleated
        inorder(root);
    
        
    }
    
}
