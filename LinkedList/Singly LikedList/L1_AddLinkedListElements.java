public class L1_AddLinkedListElements{
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
    public void addFirst(int data){     // addFirst takes single operation every time so its time complexity is O(1).
        // Step1 :- create new node
        Node newNode=new Node(data);

        // base case:- if linkedList is empty
        if(head==null){
            head=tail=newNode;      // in the beginning linkedList is empty so it will be head as well as tail.
            return;
        }
        
        // Step2:- newNode next=head
        newNode.next=head;
        // Step3:- head=newNode
        head=newNode;
    }
    public void addLast(int data){  // // addlast takes single operation every time so its time complexity is O(1).
        // Step-1:-create newNode
        Node newNode=new Node(data);
        //base case: if linkedList is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        // Step-3:-NewNode next=tail
        tail.next=newNode;
        // Step-3:-
        tail=newNode;
    }
    public void print(){    // b/c print function goes to each node of LinkdList so its time complexity is O(n).
        // // base case :- if linkedList is vacant i.e. head=null
        // if(head==null){
        //     System.out.println("LinkedList is empty");
        //     return;
        // }
        Node temp=head; // node temp is created .
        //  NOTE:- In LinkedList head and tail cannot be change so head is assign to temp variable.
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;  
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        L1_AddLinkedListElements ll=new L1_AddLinkedListElements();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);  // 3 add as data and its next point to null.
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}











