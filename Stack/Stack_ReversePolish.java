// import java.util.*;
// import java.util.Stack;
// public class Stack_ReversePolish {
//     public static void main(String[] args) {
//         Stack <Character> st=new Stack<>();
//         String str="24-";
//         // String str="24*3-";
//         int l=str.length();
//         int i=0;
//         System.out.println(l);
//         while(i<l-1){
//             char a=str.charAt(i);
//             char b=str.charAt(i+1);
//             char ch=str.charAt(i);
//             if(ch!='-' || ch!='+' || ch!='*' ||ch!='/'){
//                 st.push(str.charAt(i));
//                 // st.push(str.charAt(a-b)); 
//             }
//             else{
               
//                 // char ch=ch1+ch2;
//                 if(str.charAt(i)=='-'){
//                     char ch1=st.pop();
//                     char ch2=st.pop();
//                     char n='a'-48;
//                     System.out.println(n);
//                     // st.push(n);
//                     st.push(str.charAt(a-b));

//                 }
             
//             }


               
//             i++;

//         }
//         System.out.println(st.peek());
//     }
    
// }
















import java.util.*;
import java.util.Stack;
public class Stack_ReversePolish {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        String str="24/";
        // String str="24*3-";
        int l=str.length();
        int i=0;
        // System.out.println(l);
        while(i<l){
            char ch=str.charAt(i);
                System.out.println(ch);
            if(ch!='-' || ch!='+' || ch!='*' ||ch!='/'){
                int a=ch-48;
                // st.push(str.valueOf(i));
                st.push(a);
                System.out.println(st.peek());
            i++;

         
            }
            // else if(ch=='-'){
            //     int c1;
            //     int c2;
            //     int c;
            //      c1=st.pop();
            //      c2= st.pop();
            //    st.push(c1-c2);
            //     System.out.println(st.peek());


            // }

            // else if(ch=='+'){
            //     int c1;
            //     int c2;
            //     int c;
            //      c1=st.pop();
            //      c2= st.pop();
            //    st.push(c1+c2);
               
            // }
            // else if(ch=='/'){
            //     int c1;
            //     int c2;
            //     int c;
            //      c1=st.pop();
            //      c2= st.pop();
            //    st.push(c1/c2);
               
            // }
            // else if(ch=='*'){
            //     int c1;
            //     int c2;
            //     int c;
            //      c1=st.pop();
            //      c2= st.pop();
            //    st.push(c1*c2);
            
            // }
        


               
            // i++;

        }

        
    }
    
}

