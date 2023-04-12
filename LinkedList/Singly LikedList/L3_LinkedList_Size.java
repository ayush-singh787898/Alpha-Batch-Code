
// public class L3_LinkedList_Size {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;         // by default size is zero. size is static b/c if we want to increase the size of node  then the same changes directly occur at static int size.
//     public static void addFirst(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public  void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){
//             head=tail=null;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public  void print(){
//         // if(head==null){
//         //     System.out.println("Linked list is empty"+"->");

//         // }
//         Node temp=head;
//         while(temp!=null){
//         System.out.print(temp.data+"->");
//         temp=temp.next;

//         }
//         System.out.println("null");
//     }
//     public  void addMid(int indx,int data){
//         // base case
//         if(indx==0){
//             addFirst(data);
//             return;
//         }
//         Node newNode=new Node(data);
//         size++;
//         Node temp=head;
//         int i=0;
//         while(i<indx-1){
//             temp=temp.next;
//             i++;
//         }
//         //  at i=indx-1 , temp->prev
//         newNode.next=temp.next;
//         temp.next=newNode;

//     }


//     public static void main(String[] args) {
//         L3_LinkedList_Size ll=new L3_LinkedList_Size();
//         // ll.print();
//         ll.addFirst(2);
//         // ll.print();
//         ll.addFirst(1);
//         // ll.print();
//         ll.addLast(3);
//         // ll.print();
//         ll.addLast(4);
//         // ll.print();
//         ll.addMid(2,9);
//         ll.print();
//         System.out.println("Size of lindedList is: "+ll.size);        
//     }
    
// }












        // LinkedList Size simple

    
public class L3_LinkedList_Size {
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
    public static int size;         // by default size is zero.
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public  void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=null;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public  void addMid(int indx,int data){
        // base case
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
        //  at i=indx-1 , temp->prev
        newNode.next=temp.next;
        temp.next=newNode;

    }
        // // calculate size of node method-2
    public int sizeNode(){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            sz++;

            temp=temp.next;
        }
        return sz;
    }

    public static void main(String[] args) {
        L3_LinkedList_Size ll=new L3_LinkedList_Size();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMid(2,9);
        System.out.println("Size of lindedList is: "+ll.size);   
        System.out.println(ll.sizeNode());     
    }
    
}
