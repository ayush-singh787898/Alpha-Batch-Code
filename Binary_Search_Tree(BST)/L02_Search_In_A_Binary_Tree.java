public class L02_Search_In_A_Binary_Tree {
    public static class Node{
        Node left;      // by default left=null
        Node right;     // by defatlt right=null
        int data;
        Node(int data){
            this.data=data;
        }
    }
public static boolean search(Node root,int key){            // time complexity O(H).  where H is height of tree.
    if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    if(root.data>key){
        return search(root.left, key);
    }
    return search(root.right, key);
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
        if(search(root, 8)){
            System.out.println("key is present in tree");
        }
        else{
            System.out.println("key is not present in tree");
        }

        
    }
    
}
