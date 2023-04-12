public class L2_AddLinkedListElementAtMid {
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
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public  void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public  void print(){
        // if(head==null){
        //     System.out.println("Linked list is empty"+"->");

        // }
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;

        }
        System.out.println("null");
    }
    public  void addMid(int indx,int data){
        if(indx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        //  at i=indx-1 , temp->prev
        newNode.next=temp.next;
        temp.next=newNode;

    }


    public static void main(String[] args) {
        L2_AddLinkedListElementAtMid ll=new L2_AddLinkedListElementAtMid();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        // ll.print();
        ll.addMid(2,9);     // 9 is added at index 2
        ll.print();
        
    }
    
}
