import java.rmi.server.RemoteRef;

public class L09_Subtree_Of_another_Tree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
            // static class Info{
            //     int diam;
            //     int ht;
            //     public Info(int diam,int ht){
            //         this.diam=diam;     // dia means diameter
            //         this.ht=ht;         // ht means height
            //     }

            // }
            // public static Info diameter(Node root){         // linear Time complexity O(n);
            //     if(root==null){
            //         return new Info(0, 0);      // diameter and height both are zero

            //     }
            //     Info leftInfo=diameter(root.left);
            //     Info rightInfo=diameter(root.right);
            //     int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht);
            //     int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
            //     return new Info(diam,ht);

            // }
            public static boolean isIdentical(Node node,Node subRoot){
                if(node==null && subRoot==null){
                    return true;

                }
                else if(node==null || subRoot==null || node.data!=subRoot.data){
                    return false;
                }
                if(!isIdentical(node.left, subRoot.left)){
                    return false;
                }
                if(!isIdentical(node.right, subRoot.right)){
                    return false;
                }
                return true;
            }
            public static boolean isSubTree(Node root,Node subRoot){            // isSubTree will check where is subRoot of main tree lies;
                // base case
                if(root==null){
                    return false;
                }
                if(root.data==subRoot.data){
                    if(isIdentical(root,subRoot)){
                        return true;
                    }
                    
                }
                boolean leftAns=isSubTree(root.left,subRoot);
                boolean rightAns=isSubTree(root.right, subRoot);
                // return leftAns || rightAns;
                return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
            }
    
    public static void main(String[] args) {
 /*
          1
        /   \
      2      3   
    /  \    /  \
   4    5  6     7
         
*/
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    // System.out.print(("Diameter of tree is: "));
    // System.out.println(diameter(root).diam);        // diameter of object is returned.
    // System.out.print("height of Tree is: ");
    // System.out.print(diameter(root).ht);
/*
     
                        2
                       / \
                      4   5
*/                  
    Node subRoot=new Node(2);
    subRoot.left=new Node(4);
    subRoot.right=new Node(5);
    System.out.println(isSubTree(root, subRoot));

    }
}