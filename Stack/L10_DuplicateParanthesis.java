import java.util.Stack;
public class L10_DuplicateParanthesis {
    public static boolean isDuplicate(String str){              // time complexity O(n)
        Stack<Character> s=new Stack();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){       // peek means top
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;            //duplicate exist
                }
                else{
                    s.pop();            // opening pair
                }
            }
            else{
                // opening condition
            s.push(ch);
            }
        }
        return false;       // if duplicate doesn't exist retun false
    }
    public static void main(String[] args) {
        // String str="((a+b)+(c+d))";      // false b/c duplicacy doesn't exist
        String str="(((a+b)+(c+d)))";       // true b/c duplicacy exist
        System.out.println(isDuplicate(str));
    }
    
}
