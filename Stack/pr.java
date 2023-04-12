






import java.util.Stack;
public class pr {
    // class Solution {
        public static int evalRPN(String[] tokens) {
            // Stack <Integer> str=new Stack<>();
            Stack <Integer> str=new Stack();
            int arr[]={1,3,4,1,3,};
            // [] arr=tokens.toCharArray();
            // char[] arr = tokens.valueOf();
            // char[] arr=tokens.toCharArray();
            // char[] ch = new char[tokens.length()];
            for(int i=0;i<arr.length;i++){
                // for(Character ch:tokens)
                // for(int i=0;i<tokens.length;i++){
                if(arr[i]!='-' || arr[i]!='+' || arr[i]!='*' || arr[i]!='/'){
                    int c=arr[i]-'0';
                    str.push(c);
                }
                // for(Character ch:tokens.toCharArray()){
                //     // if(ch!='+' && ch!='-' && ch!='*' && ch!='/'){
        
                //     // }
                //     if(Character.isDigit(ch)){
                //         int c=ch-'0';
                //         str.push(c);
                //     }
                
                else{
                    if(arr[i]=='-'){
                        int a=str.pop();
                        int b=str.pop();
                        int c=b-a;
                        str.push(c);
                    }
                    else if(arr[i]=='+'){
                        int a=str.pop();
                        int b=str.pop();
                        int c=b+a;
                        str.push(c);
                        
                    }
                         else if(arr[i]=='*'){
                        int a=str.pop();
                        int b=str.pop();
                        int c=b*a;
                        str.push(c);
                        
                    }
                         else if(arr[i]=='/'){
                        int a=str.pop();
                        int b=str.pop();
                        int c=b/a;
                        str.push(c);
                        
                    }
                    // int y=str.intvalue();

                    // return str.pop();
                            // int a = Integer.parseInt(str.pop());
                            System.out.println(str.peek());

                            int y=Integer.valueOf(str.pop());

                    return y;
                            // System.out.print 0ln(str.peek());

                }
            // 1}
            // return -1;
            // System.out.printl 0n("No output");
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr[]={"21+3-"};
        evalRPN(arr);
        System.out.println(evalRPN(arr));
        
    }
    
}


































// import java.util.*;
// public class pr {
//     // class Solution {
//         public int evalRPN(String[] tokens) {
//             // Stack <Integer> str=new Stack<>();
//             Stack <Integer> str=new Stack();

//             // char [] arr=tokens.toCharArray();
//             // char[] arr = tokens.toCharArray();
//             // char[] arr=tokens.toCharArray();
//             // char[] ch = new char[tokens.length()];
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i]!='-' || arr[i]!='+' || arr[i]!='*' || arr[i]!='/'){
//                     str.push(arr[i]);
//                 }
//                 else{
//                     if(arr[i]=='-'){
//                         int a=str.pop();
//                         int b=str.pop();
//                         int c=b-a;
//                         str.push(c);
//                     }
//                     else if(arr[i]=='+'){
//                         int a=str.pop();
//                         int b=str.pop();
//                         int c=b+a;
//                         str.push(c);
                        
//                     }
//                          else if(arr[i]=='*'){
//                         int a=str.pop();
//                         int b=str.pop();
//                         int c=b*a;
//                         str.push(c);
                        
//                     }
//                          else if(arr[i]=='/'){
//                         int a=str.pop();
//                         int b=str.pop();
//                         int c=b/a;
//                         str.push(c);
                        
//                     }
//                     return c;
//                 }
//             // }
//             return -1;
//         }
//     }
//     public static void main(String[] args) {
        
//     }
    
// }
