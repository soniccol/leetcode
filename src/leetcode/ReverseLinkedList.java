package leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
    	if(head.next==null) return head;
    	
    	java.util.Stack<ListNode> stack = new java.util.Stack<ListNode>();
    	while(head.next!=null){
    		ListNode t=new ListNode(head.val);    		
    		stack.push(t);
    		head=head.next;
    	}
    	ListNode t=new ListNode(head.val);    		
		stack.push(t);
    	
    	ListNode result=null;
    	while(!stack.isEmpty()){
    		ListNode temp=stack.peek();
    		if(result==null) result=temp;
    		else{
    			ListNode current=result;
    			while(current.next!=null){
    				current=current.next;
    			}
    			current.next=temp;
    		}
    		stack.pop();    		
    	}
    	return result;
    }
}
