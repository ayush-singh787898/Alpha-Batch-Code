import java.util.Stack;
public class L07_Stock_Span{
    public static void stockSpan(int stocks[],int span[]){
        // Stack<Integer>s=new Stack<>();
        Stack <Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        // for each day use for-loop for checking each day span.
        for(int i=1;i<stocks.length;i++){
            // span calculation
            int currPrice=stocks[i];
            while(!s.isEmpty()&& currPrice>stocks[s.peek()]){
                s.pop();

            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int preHigh=s.peek();
                span[i]=i-preHigh;
            }
            s.push(i);
        }
       
    } 
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]+" ");

        }
      
    }
}