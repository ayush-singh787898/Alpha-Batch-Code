public class L01_Doubly_LinkedList_Creation {
    public class Node{
        Node next;
        Node prev;
        int data;
        public Node(int data){      // Node constructor
            this.data=data;
            this.next=null;
            this.prev=null;
    }
    }
    public static Node head;
    public static Node tail;
    public static int size;     // size is 0
    // add doubly LinkedList
    public void addFirt(int data){
        Node newNode=new Node(data);
        size++;
        // base case if Doubly LinkedList is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    

    // print
    public  void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");

    }


    public static void main(String[] args) {
        L01_Doubly_LinkedList_Creation dll=new L01_Doubly_LinkedList_Creation();
        dll.addFirt(5);
        dll.addFirt(4);
        dll.addFirt(3);
        dll.addFirt(2);
        dll.addFirt(1);
        dll.print();
        System.out.println(dll.size);
        
    }
}
