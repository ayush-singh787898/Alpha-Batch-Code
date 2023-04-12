import java.util.*;;
public class L09_Convert_BST_to_Balanced_BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

        // preorder to check answer is correct or not
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBST(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr, start,mid-1);          // start=start and end=mid-1
        root.right=createBST(arr, mid+1, end);          // start=mid+1 and end=end.
        return root;

    }
    public static void getInorder(Node root,ArrayList<Integer>inorder){
        if(root==null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node createBST(ArrayList<Integer>inoder,int st,int end){
        if(st>end){         // invalid condition
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inoder.get(mid));
        root.left=createBST(inoder, st, mid-1);     // left subtree creation from start(st) to end(mid-1)
        root.right=createBST(inoder, mid+1, end);            // right subtree creation from start(mid+1) to end(end)
        return root;

    }
    public static Node balanceBST(Node root){       //O(N)
        // Inorder Sequence - O(n)
        ArrayList<Integer>inorder=new ArrayList<>();
        getInorder(root, inorder);
        //  sorted inoder --> balance BST   O(n)

        root=createBST(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        /*
                  input Normal Binary search Tree
                    8
                  /   \
                 6     10
                /        \
               5          11
              /              \
             3                12 

*/

        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        root=balanceBST(root);
        preorder(root);





// output
/*
        Expected Balance binary search tree

                    8
                  /   \
                 5     11
                / \   /  \
               3   6 10   12   
    







 */




    }
    
}
