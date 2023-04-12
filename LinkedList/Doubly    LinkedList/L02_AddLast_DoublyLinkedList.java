public class L02_AddLast_DoublyLinkedList {
    public class Node{
        Node next;
        Node prev;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // add first
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void print(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        L02_AddLast_DoublyLinkedList dll=new L02_AddLast_DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();

        // data added to last of node 
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();

        
    }
    
}
