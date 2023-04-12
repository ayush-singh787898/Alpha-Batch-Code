import java.util.*;
public class L04_Implementation_Of_Queue_Using_CollectionFrameWork {
    public static void main(String[] args) {
        // Queue<Integer>q=new LinkedList<>();
        
        // OR
        Queue<Integer>q=new ArrayDeque<>();
        // Note1:- In java Queue is implemented by two ways LinkedList and ArrayDeque
        // Note2:- Queue itself cannot have its own object(cannot create object) b/c queue is interface.
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
