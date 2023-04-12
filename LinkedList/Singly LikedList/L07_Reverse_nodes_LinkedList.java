
public class  L07_Reverse_nodes_LinkedList{
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

  public static void reverseNode(){             // time complexity is O(n)
    // reverse process takes three variable and 4 steps
    // variables are as:
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while(curr!=null){
        // steps are as:
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

    }
    head=prev;
  }
    public static void main(String[] args) {
         L07_Reverse_nodes_LinkedList ll=new  L07_Reverse_nodes_LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addMid(2,9);
        ll.print();     //1->2->9->3->4->null   Note:- head is 1 and tail is 4
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
        ll.reverseNode();
        ll.print();     //4->3->9->2->1->null           Note:- head is 4 and tail is 1
    }
    
}
