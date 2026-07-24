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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode uniq = head;
        ListNode same = head;
        while(same != null){
            if(uniq.val == same.val){
                same = same.next;
            }else{
                uniq.next = same;
                uniq = uniq.next;
            
            }    
            
        }
        uniq.next = null;
        
        return head;
        
    }

}