public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()[]{}"));
	}
    public static boolean isValid(String s) {
    	if(s==null||s.equals("")) return false;
    	java.util.Stack<String> stack=new java.util.Stack<String>();
    	for(int i=0;i<s.length();i++){
    		String t=s.substring(i, i+1);
    		if(t.equals("(")||t.equals("[")||t.equals("{")){
    			stack.push(t);	
    		}
    		else if(t.equals(")")||t.equals("]")||t.equals("}")){
    			if(stack.isEmpty()) return false;
    			if(t.equals(")")&&stack.peek().equals("(")) stack.pop();
    			else if(t.equals("]")&&stack.peek().equals("[")) stack.pop();
    			else if(t.equals("}")&&stack.peek().equals("{")) stack.pop();
    			else return false;
    		}    		
    	}
    	
    	return stack.isEmpty();
    }
}
