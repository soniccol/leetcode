package leetcode;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
public boolean hasCycle(ListNode head) {
     ListNode slow=head;
     ListNode fast=head;
     while(slow!=null&&fast!=null&&fast.next!=null){
          slow=slow.next;
          if(fast.next.next==null) return false;
          else fast=fast.next.next;
          
          if(fast.val==slow.val){
               return true;
          }
     }
     return false;
}
}
