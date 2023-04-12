public class L01_Implementation_Queue_Using_Arrays {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){       // constructor
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;        // -1 shows no any data is stored in queqe and queue is empty

        }

        //add function              // TimeComplexity: O(1)
        public static void add(int data){
            if(rear==size-1){               // if rear reached to size-1(n-1) or last index then return
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;        // if array is empty
            arr[rear]=data;
        }

        // remove function              // TimeComplexity: O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;      // -1 shows that no any number stored
            }
            int front=arr[0];      // front position will always be fixed at 0th index.
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];

            }
            rear=rear-1;        // b/c zero index data is removed
            return front;
        }

        // peek function
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];  //front
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }    
    }
}
