
public class L08_Diameter_of_Tree_Approach2 {
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
            // public static int height(Node root){
            //     if(root==null){
            //         return 0;
            //     }
            //     int lh=height(root.left);
            //     int rh=height(root.right);
            //     return Math.max(lh,rh)+1;
            // }
            // public static int diameter(Node root){      // time complexity: O(n^2)
            //     if(root==null){
            //         return 0;
            //     }
            //     int leftDimeter=diameter(root.left);
            //     int leftHeight=height(root.left);
            //     int rightDiamter=diameter(root.right);
            //     int rightHeight=height(root.right);
            //     int selDiameter=leftHeight+rightHeight+1;       // 1 is used for self node
            //     return Math.max(selDiameter,Math.max(leftDimeter,rightDiamter));
    
            // }
            static class Info{
                int diam;
                int ht;
                public Info(int diam,int ht){
                    this.diam=diam;     // dia means diameter
                    this.ht=ht;         // ht means height
                }

            }
            public static Info diameter(Node root){         // linear Time complexity O(n);
                if(root==null){
                    return new Info(0, 0);      // diameter and height both are zero

                }
                Info leftInfo=diameter(root.left);
                Info rightInfo=diameter(root.right);
                int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht);
                int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
                return new Info(diam,ht);

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
System.out.print(("Diameter of tree is: "));
System.out.println(diameter(root).diam);        // diameter of object is returned.
System.out.print("height of Tree is: ");
System.out.print(diameter(root).ht);
    }
    
}
