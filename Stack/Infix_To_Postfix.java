    
// }
import java.util.*;
import java.util.Stack;
public class Infix_To_Postfix {


    public static void main(String[] args) {
        Stack<Character> operators = new Stack<>();
        //String infix = "A/B-C+D*E-A*C";          //output postfix-->  // AB/-C+DE*-AC*
       // String infix="(A-B)*(D/E)";
        //String infix="(x+y*z^p-(x/y)+z)";
        String infix="a-b/(c+d)*(e-r)";
        char symbol;  
String postfix = "";  
for(int i=0;i<infix.length();++i)  
//while there is input to be read  
{  
symbol = infix.charAt(i);  
//if it's an operand, add it to the string  
if (Character.isLetter(symbol))  
postfix = postfix + symbol;  
else if (symbol=='(')  
//push (  
{  
operators.push(symbol);  
}  
else if (symbol==')')  
//push everything back to (  
{  
while (operators.peek() != '(')  
{  
postfix = postfix + operators.pop();  
}  
operators.pop();        //remove '('  
}  
else  
//print operators occurring before it that have greater precedence  
{  
while (!operators.isEmpty() && !(operators.peek()=='(') && prec(symbol) <= prec(operators.peek()))  
postfix = postfix + operators.pop();  
operators.push(symbol);  
}  
}  
while (!operators.isEmpty())  
    postfix = postfix + operators.pop();  
System.out.println(postfix);  // final result after all steps completed
 
}  
static int prec(char x)  
{  
if (x == '+' || x == '-')  
return 1;  
if (x == '*' || x == '/' || x == '%')  
return 2;  
if(x=='^')
return 3;
return 0; 
    }
}