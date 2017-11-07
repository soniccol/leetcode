package leetcode;
class ImplementStackusingQueues {
	
	java.util.Queue<Integer> q1=new java.util.LinkedList<Integer>();
	java.util.Queue<Integer> q2=new java.util.LinkedList<Integer>();
	
    // Push element x onto stack.
    public void push(int x) {
        if(q1.isEmpty()&&q2.isEmpty()) q1.add(x);
        else if(!q1.isEmpty()&&q2.isEmpty()){
        	q2.add(x);
        	while(!q1.isEmpty()){
        		q2.add(q1.remove());
        	}
        }else if(q1.isEmpty()&&!q2.isEmpty()){
        	q1.add(x);
        	while(!q2.isEmpty()){
        		q1.add(q2.remove());
        	}
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(q1.isEmpty()) q2.remove();
        else if(q2.isEmpty()) q1.remove();
    }

    // Get the top element.
    public int top() {
    	if(q1.isEmpty()) return q2.peek().intValue();
    	else return q1.peek().intValue();   
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(q1.size()>q2.size()) return q1.isEmpty();
        else return q2.isEmpty();
    }
}
