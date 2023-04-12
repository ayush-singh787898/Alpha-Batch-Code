import java.util.ArrayList;

//  we have to print the lowest common node 
public class L12_Lowest_Common_Ancestor_Recursion{
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
    public static Node lowestCommonAncestor(Node root,int n1,int n2){           // linear time complexity O(n).
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        getPath(root, n1, path1);       // root se n1 ka path calculation
        getPath(root, n2, path2);       // root se n2 ka path calculation

        // find last common ancestor
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;

            }
        }
    // Last equal Node --> i-ith

        
        Node lowestCommonAncestor=path1.get(i-1);
        return lowestCommonAncestor;

    }
    public static boolean getPath(Node root,int n,ArrayList<Node>path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundLeft=getPath(root.left,n,path);        // if condition true then return true othterwise return false;
        boolean foundRight=getPath(root.right,n,path);          

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);             // if node is not found which we searach then we will remove then current node which is present at last index from arrayList.
        return false;
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
    int n1=4,n2=7;      // n1 and n2 are node where we have to find out lowest common  ancestor of these nodes
    System.out.println(lowestCommonAncestor(root, n1, n2).data);


    }
}