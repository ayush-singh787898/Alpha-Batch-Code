import java.util.Stack;
public class Postfix {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        String s="99*62/+";
        for(Character ch:s.toCharArray()){
            // if(ch!='+' && ch!='-' && ch!='*' && ch!='/'){

            // }
            if(Character.isDigit(ch)){
                int c=ch-'0';
                stack.push(c);
            }
       else{
         if(ch=='+'){
            int a=stack.pop();
            int b=stack.pop();
            int c=b+a;
            stack.push(c);
        }
        else if(ch=='-'){
            int a=stack.pop();
            int b=stack.pop();
            int c=b-a;
            stack.push(c);
        }
        else if(ch=='*'){
            int a=stack.pop();
            int b=stack.pop();
            int c=a*b;
            stack.push(c);
        }
        else if(ch=='/'){
            int a=stack.pop();
            int b=stack.pop();
            int c=b/a;
            stack.push(c);
        }
       }


        }

        System.out.println(stack.peek());
    }
}
