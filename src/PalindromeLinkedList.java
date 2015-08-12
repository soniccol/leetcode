    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        ListNode newT=head;
        ListNode newHead=new ListNode(0);
        ListNode newP=newHead;
        
        
        while(newT.next!=null){
        	ListNode temp=new ListNode(newT.next.val);
        	temp.next=newP.next;
        	newP.next=temp;
        	newT=newT.next;
        	
        }
        newP=newHead.next;
        newT=head;
        while(newT.next!=null){
        	if(newT.val!=newP.val) return false;
        	else{
        		newT=newT.next;
        		newP=newP.next;
        	}
        }        
    	return true;
    }
