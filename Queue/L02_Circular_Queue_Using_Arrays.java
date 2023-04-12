public class L02_Circular_Queue_Using_Arrays {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){       // constructor
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;        // -1 shows no any data is stored in queqe and queue is empty

        }

        // full function: circle condition
        public static boolean isFull(){         
            // return (rear+1)%size==front;
            return front==(rear+1)%size;        // we are increasing rear by 1 and at next index there is front(it means there is already element present at rear+1) and rear cannot move to rear+1;
        }



        //add function              // TimeComplexity: O(1)
        public static void add(int data){
            if(isFull()){               // if rear reached to size-1(n-1) or last index then return
                System.out.println("queue is full");
                return;
            }
            // add first element
            if(front==-1){      // add first condition
                front=0;
            }

            rear=(rear+1)%size;        // if array is empty
            arr[rear]=data;

        }

        // remove function              // TimeComplexity: O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;      // -1 shows that no any number stored
                // return front=rear=-1;
            }
            int result=arr[front];
            // last element delete
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;

            }
            return result;
        }

        // peek function
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
                // return front=rear=-1;
            }
            return arr[front];  //front
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
       
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
    
}
