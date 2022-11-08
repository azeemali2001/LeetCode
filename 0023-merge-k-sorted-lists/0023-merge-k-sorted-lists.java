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
    
    public ListNode mergeKLists(ListNode[] lists) {
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<lists.length;i++){
            ListNode node = lists[i];
            while(node != null){
                pq.add(node.val);
                node = node.next;
            }
        }
        
        ListNode dummy = new ListNode();
        
        if(pq.size() == 0){
            return null;
        }
        
        dummy.val = pq.remove();
        ListNode p = dummy;
        
        while(pq.size() != 0){
            ListNode node = new ListNode(pq.remove());
            p.next = node;
            p = p.next;
        }
        
        return dummy;

    }
}