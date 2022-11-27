/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public static ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode curr = node;
        
        while(curr != null) {
            ListNode nbr = curr.next;
            
            curr.next = pre;
            pre = curr;
            curr = nbr;
        }
        
        return pre;
    }
    
    public ListNode removeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode p1 = dummy;
        
        
        ListNode node = reverse(head);
        ListNode ptr = node;
        int max = Integer.MIN_VALUE;
        
        while(ptr != null) {
            if(ptr.val >= max){
                max = ptr.val;
                ListNode temp = new ListNode(ptr.val);
                p1.next = temp;
                p1 = p1.next;
            }
            
            ptr = ptr.next;
        }
        return reverse(dummy.next);
    }
}