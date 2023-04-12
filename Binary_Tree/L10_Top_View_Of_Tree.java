
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class L10_Top_View_Of_Tree{
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
    // public static boolean isIdentical(Node node,Node subRoot){
    //     if(node==null && subRoot==null){
    //         return true;

    //     }
    //     else if(node==null || subRoot==null || node.data!=subRoot.data){
    //         return false;
    //     }
    //     if(!isIdentical(node.left, subRoot.left)){
    //         return false;
    //     }
    //     if(!isIdentical(node.right, subRoot.right)){
    //         return false;
    //     }
    //     return true;
    // }
    // public static boolean isSubTree(Node root,Node subRoot){            // isSubTree will check where is subRoot of main tree lies;
    //     // base case
    //     if(root==null){
    //         return false;
    //     }
    //     if(root.data==subRoot.data){
    //         if(isIdentical(root,subRoot)){
    //             return true;
    //         }
            
    //     }
    //     boolean leftAns=isSubTree(root.left,subRoot);
    //     boolean rightAns=isSubTree(root.right, subRoot);
    //     // return leftAns || rightAns;
    //     return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    // }

    public static class Info{
        Node node;
        int hd;     // horizontal distance
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        // level order traversal in queue
        Queue<Info>q=new LinkedList<>();

        // create Hashmap to store horizontal distance and node's data.
        Map<Integer,Node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root,0));  //bydefault horizontal distance of root is 0 
        q.add(null);
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(q==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            // if horizontal distance of current information does not exist in map then add horizontal distance of curr data in map.
            if(!map.containsKey(curr.hd))   {           // first time horizontal  distance is occuring
                map.put(curr.hd,curr.node);
            }   
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min =Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
        // print top view data
        for(int i=0;i<=max;i++){        // here i show key i.e. horizontal distance
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();


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
                     /     \
                    4       5
*/                  
    // Node subRoot=new Node(2);
    // subRoot.left=new Node(4);
    // subRoot.right=new Node(5);
    // System.out.println(isSubTree(root, subRoot));

    }
}