import java.util.Stack;
public class L09_validParanthesis {
    public static boolean isValid(String str){
        Stack <Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){  // opening
                s.push(ch);
            }
            else{
                // closing tag
                if(s.isEmpty()){    // no opening tag only closing tag present like:- ]]))}}
                    return false;
                }
                // pair form or not
                if(s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']' || s.peek()=='(' && ch==')'){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // String str="[({}){}]";
        String str="[{()}]";
        isValid(str);
        System.out.println(isValid(str));
        
    }
    
}
