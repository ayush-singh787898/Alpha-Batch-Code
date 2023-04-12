

public class L01_Buil_A_BST{
    public static class Node{
        Node left;
        Node right;
        int data;
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


//  just for checking values passes in tree or not
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
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insertBST(root, values[i]);
        }
        inorder(root);
        
        
    }

}