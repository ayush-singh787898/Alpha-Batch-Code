
public class L04_reverse_DoublyLinkedList {
    public class Node{
        Node next;
        Node prev;
        int data;
        public Node(int data){
            this.next=null;
            this.prev=null;
            this.data=data;
        }
    }
    public static Node head;
    public  static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            // return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void removeFirst(){
        head=head.next;
        head.prev=null;
        size--;
    }
    public void removeLast(){
        tail.prev.next=null;
        tail.prev=null;
        size--;
    }
    
    // REVERSE DOUBLE LINKED-LIST

    public Node reverseDoublyLL(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
 
    public static void main(String[] args) {
        L04_reverse_DoublyLinkedList dll=new L04_reverse_DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        // dll.print();
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();
        System.out.println("size of linkedList size:"+dll.size);

        // remove-first
        dll.removeFirst();
        dll.print();
        System.out.println("size of linkedList size:"+dll.size);


        //remove-Last
        dll.removeLast();
        dll.print();
        System.out.println("size of linkedList size:"+dll.size);

        // Reverse
        dll.reverseDoublyLL();
        dll.print();
    }
    
}
