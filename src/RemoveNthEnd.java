package leetcode;

public class RemoveNthEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoveNthEnd RemoveNthEnd = new RemoveNthEnd();
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
//		System.out.println("result="+RemoveNthEnd.removeNthFromEnd(head, 2).val);

		head=RemoveNthEnd.removeNthFromEnd(head,2);
		
		while(head.next!=null){
			System.out.println("head="+head.val+head.next.val);
			head=head.next;
		}
		
	}
	
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//    	ListNode newHead = new ListNode(-1);
//        newHead.next = head;
//    	
//    	ListNode p=head;
//    	ListNode q=head;
//    	
//    	for(int i=0;i<n;i++){
//    		q=q.next;
//    	}
//    	while(q.next!=null){
//    		q=q.next;
//    		p=p.next;
//    	}
//    	p.next=p.next.next;
//    	
//    	return newHead.next;
//    }

	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy, q = dummy;
        int count = 0;
        while(p.next != null){
            if(count >= n)
                q = q.next;
            p = p.next;
            count++;
        }
        if(q.next != null)
            q.next = q.next.next;
        return dummy.next;
    }
    
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}