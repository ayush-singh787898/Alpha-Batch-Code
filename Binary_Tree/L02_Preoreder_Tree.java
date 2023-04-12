public class L02_Preoreder_Tree {
    public static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Binary_Tree{
        static int index=-1;

        public static Node  buildTree(int node[]){
            index++;
            if(node[index]==-1){
                return null;
            }
            // Node newNode=new Node(node[index]);
            Node newNode=new Node(node[index]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;
        }

        //  PreOrder-Traversal
        public static void preeOrder(Node root){            // Time complexity is O(n).
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preeOrder(root.left);
            preeOrder(root.right);
        }

        // Inorder-Traversal
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        // PostOrder-Traversal
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree bt=new Binary_Tree();
        Node root=bt.buildTree(node);
        System.out.println("Root node : "+root.data);
        System.out.println("Preorder elements are as:");
        bt.preeOrder(root);
        System.out.println();
        System.out.println("Inorder traveral are as:");
        bt.inorder(root);
        System.out.println();
        System.out.println("PostOrder traversal elements are as:");
        bt.postOrder(root);


        
    }
    
}
