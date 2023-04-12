
public class  L10_Remove_Cycle{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=null;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node  temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addMid(int indx,int data){
        if(indx==0){
            addFirst(data);
            return;

        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int remmoveFirst(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;

        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }   
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LindedLIst is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // previous node(second last node)=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;           // before deleting value(tail data)  is stored in val

        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    // Iterative Search Approach:- search whether key present(return 1) or not (if not present return -1)in LinkedList.
    public int  itrSearch(int key){         // time  complexity for iteration is O(n)
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return 1;
            }
            temp=temp.next;
            i++;

        }
        return -1;
    }
    // Recursive Search Approach :- search index where key present in LinkedList.
    public  int helper(Node head,int key){      // time complexity and space complexity(b/c n stack recquired) is linear O(n)
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;

        }
        int indx=helper(head.next,key);
        if(indx==-1){
            return -1;
        }
        return indx+1;
    }

    public  int recSearch(int key){
        return helper(head,key);

    }
            // Remove nth node from last
    // // calculate size of node
    // public int sizeNode(){
    //     int sz=0;
    //     Node temp=head;
    //     while(temp!=null){
    //         sz++;

    //         temp=temp.next;
    //     }
    //     // return sz;
    // }

    public int deletenthNodeFromLast(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            // head=head.next; // removeFirst operation
            return head.next.data;
        }
        // size n-1
        int i=1;
        int indxToFind=size-n;
        Node prev=head;
        while(i<indxToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head.data;
    }

    //  LINKEDLIST IS PALINDROME OR NOT
   // mid-node calculation
    public Node findMidNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;     // slow jumps one step of node
            fast=fast.next.next;    // fast jumps two steps of node
        }
        return slow;
    }
     // Steps:
    public boolean checkPalindrome(){
        // base case
        if(head==null || head.next==null){
            return true;
        }
    // Step 1:- find mid-node using slow fast-approach.
        Node midNode=findMidNode(head);
        Node prev=null;
        Node next;
        Node curr=midNode;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    //   CYCLE IN LINKED LIST   :- Floyds cycle finding algorithm.
    public static boolean isCycle() {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;                 // slow moves by +1 step
            fast=fast.next.next;            // fast moves by +2 step
            if(slow==fast){
                return true;                   // true means cycle exist.
            }
        }
        return false;               // false means cycle does not exist b/c in cycle there is no null exist.
    }


    //      REMOVE CYCLE PROGRAM
    public static void removeCycle(){
        // Step-1: detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;    // initially cycle does not exist.
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true; // cycle exist
                break;
            }
        }
        if(cycle==false){
            return;
        }
        // Step-2 :-    Find meeting point: 
        slow=head;      // now slow becomes head.
        Node prev=null;     // last node(prev node ) is null.
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;


    }
    public static void main(String[] args) {
         L10_Remove_Cycle ll=new  L10_Remove_Cycle();
        // ll.print();
        // ll.addFirst(1);
        // // ll.print();
        // ll.addFirst(2);
        // // ll.print();
        // ll.addLast(2);
        // // ll.print();
        // ll.addLast(4);
        // ll.print();
        // // ll.addMid(2,9);
        // ll.print();
        // // System.out.println(ll.size);   
        // // ll.remmoveFirst();
        // // System.out.println("After remove first element linkedList is:");
        // // ll.print();     
        // // ll.removeLast();
        // // ll.print();
        // // System.out.println(ll.size);
        // // ll.print();
        // // System.out.println(ll.itrSearch(3));        // key found output=1
        // // System.out.println(ll.itrSearch(10));          // key not found output=-1
        // // System.out.println(ll.recSearch(3));        // key found at index=2
        // // System.out.println(ll.recSearch(10));        // key not found in linkedList so indx=-1
        // // System.out.println(ll.sizeNode());
        // ll.deletenthNodeFromLast(2);
        // ll.print();
        // System.out.println(ll.checkPalindrome());
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next=new Node(2);
        head.next.next=temp;
        head.next.next.next=new Node(4);
        head.next.next.next.next=temp;          // using this line we get true otherwize false
        System.out.println(isCycle());      // cycle exist
        removeCycle();  // cycle remove
        System.out.println(isCycle());   //false

    }
    
}
