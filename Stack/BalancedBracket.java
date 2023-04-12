import java.util.Stack;
class BalancedBracket{
	public static void main(String[] args) {
		
	Stack<Character> stack =new Stack<>();
	String str="[{()}]";
		for(Character ch : str.toCharArray()){
			if("([{".indexOf(ch)>=0){
				stack.push(ch);
			}
			else if("})]".indexOf(ch)>=0 && !stack.isEmpty()){
				Character cc = stack.pop();
				boolean f=(cc=='(' && ch==')' || cc=='{' && ch=='}' || cc=='[' && ch==']');
					if(!f){
						System.out.println("error");
						break;
					}				
			}
		}
		if(!stack.isEmpty()){
			System.out.println("error");
		}
	}
	}