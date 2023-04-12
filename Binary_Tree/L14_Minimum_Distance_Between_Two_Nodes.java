
public class L14_Minimum_Distance_Between_Two_Nodes{
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

    public static Node lca(Node root,int n1,int n2){                // lca means lowest common ancestor
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca=lca(root.left,n1,n2);
        Node rightLca=lca(root.right,n1,n2);

        // leftLca=val
        // rigthLca=null
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        // leftLca and rightLca does not equals to null i.e value exist in nodes
        return root;
    }

    public static int minDistance(Node root,int n1,int n2){
        Node lca=lca(root,n1,n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);
        return dist1+dist2;
    }

    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right, n);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        else if(leftDist==-1){
            return rightDist+1;
        }
        else{
            return leftDist+1;            //   rightDist ==-1
        }
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
    int n1=4,n2=6;
    System.out.println(minDistance(root, n1, n2));
    }
}