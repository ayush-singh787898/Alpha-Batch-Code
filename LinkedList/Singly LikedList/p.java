public class p {
    public class Node{
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
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    public void addLast(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void length(){
        int sz=0;
        while(head.next!=null){
            sz++;
        }
        // return sz;
        System.out.println(sz);
    }
    public void addMid(int indx,int data){
   
    }
    public static boolean iterativeSearch(int key){
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    // removeFirst
    public static Node removeFirst(){
        if(head==null){
            return head;
        }
        Node temp=head;
        temp=temp.next;
        temp=null;
        head=temp;
    }
    public static void main(String[] args) {
        p ll=new p();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        // ll.leṣngth();
        System.out.println(ll.size);
        System.out.println(ll.iterativeSearch(3));
        System.out.println(ll.iterativeSearch(33));
        ll.removeFirst();
        ll.print();
        
    }
    
}
