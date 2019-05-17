package leetcode;
class ImplementQueueusingStacks {
    
    
	java.util.Stack<Integer> inbox=new java.util.Stack<Integer>();
	java.util.Stack<Integer> outbox=new java.util.Stack<Integer>();
	
    // Push element x to the back of queue.
    public void push(int x) {
    	inbox.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(outbox.isEmpty()){
        	while(!inbox.isEmpty()){
        		outbox.push(inbox.pop());
        	}
        }
        outbox.pop();
    }

    // Get the front element.
    public int peek() {
    	if(outbox.isEmpty()){
        	while(!inbox.isEmpty()){
        		outbox.push(inbox.pop());
        	}
        }
        return outbox.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(outbox.isEmpty()){
        	while(!inbox.isEmpty()){
        		outbox.push(inbox.pop());
        	}
        }
        return outbox.isEmpty();
    }

}
