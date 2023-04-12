import java.util.Stack;

public class L05_Reverse_String_In_Stack {
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int indx=0;     // shows index position of stack
        while(indx<str.length()){
            s.push(str.charAt(indx));
            indx++;
            
        }
        // TO reverse string we will create new string
        StringBuilder result=new StringBuilder();
   
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
       
        return result.toString();
    }



    public static void main(String[] args) {
        String str="abc";
        // System.out.println(reverseString(str));
        // or
        String result=reverseString(str);
        System.out.println(result);
    }
    
}
