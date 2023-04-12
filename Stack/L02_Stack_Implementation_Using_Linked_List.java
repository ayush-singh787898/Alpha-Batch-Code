public class L02_Stack_Implementation_Using_Linked_List{
    static class Node{  // Node class will be represented as node of all linkedList class
        int data;
        Node next;
        Node(int data){     // CONSTRUCTOR
                this.data=data;
                this.next=null;
        }
    }
    static class Stack{
        // static type head node create so that we can access it in all function.
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;  // no node in linked list
        }
        // push
        public static void push(int data){  // push means replace head 
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        // pop
        public static int pop(){
            if(isEmpty()){  // check whether stack is empty or not 
                return -1;  // if stack is empty then return -1 which shows that no any element is present.
            }
            int top=head.data;
            head=head.next;
            return top;   
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;   // if stack is not empty then return top of stack.
        }
    }
    public static void main(String[] args) {
        // stack creation
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){    // whenever stack is not empty we will perform peek or pop operation.
            System.out.println(s.peek());
            s.pop();
        }   
    }
}