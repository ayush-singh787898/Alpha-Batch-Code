import java.util.Stack;
public class L08_NextGreaterElement_Using_Stack {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!stk.empty() && arr[stk.peek()]<=arr[i]){
                stk.pop();

            }
            if(stk.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[stk.peek()];
            }
            stk.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");

        }
        System.out.println();
        
    }
    
}
