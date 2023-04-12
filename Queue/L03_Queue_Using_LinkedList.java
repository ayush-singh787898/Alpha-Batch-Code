public class L03_Queue_Using_LinkedList { 
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }   
    static class Queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null & tail==null;        // queque is empty when head and tail both are null.
        }
        //add function:- add element at front             // TimeComplexity: O(1)
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            // if lindeList exist.
            tail.next=newNode;
            tail=newNode;
        }
        // remove function              // TimeComplexity: O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;      // -1 shows that no any number stored
            }
            int front=head.data;
            // when element is present in LinkedList
            if(tail==head){
                tail=head=null;
            }
            else{
                head=head.next;
            }
            return front;
        }
        // peek function
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;  
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }   
    }
}
