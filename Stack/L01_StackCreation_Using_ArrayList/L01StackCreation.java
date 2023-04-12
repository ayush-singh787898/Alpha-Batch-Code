import java.util.ArrayList;
public class L01StackCreation{
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){        // if stack is empty then return true else false.
            return list.size()==0;
        }
        // push operation
        
        public static void push(int data){
            
            list.add(data); // data automatically add at last of stack.
        }
        // pop operation:- to delete data.
        public static int pop(){    // return type int is used so that we can store the data and return it. 
            // base case:- if stack is empty retun -1.
            if(isEmpty()){
                return -1;  // -1 shows that stack is empty.
            }
            int top=list.get(list.size()-1);   //    top is one where last index of arrayList is stored. get function work in a single lines so it takes O(1) time.
            list.remove(list.size()-1);     // last index stored value is removed i.e.(list.size()-1) which takes time complexity as O(1)
            return top;
        } 
        //  peek operation:-it is easier than pop.
        public static int peek(){
                 // base case:- if stack is empty retun -1.
                 if(isEmpty()){
                    return -1;
                }
        return list.get(list.size()-1);
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