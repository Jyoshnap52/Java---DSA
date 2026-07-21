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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode result = new ListNode(0);

        int carry = 0;
        int val = 0;
        
        while(l1 != null || l2 != null){
            if(l1 == null){
                val = l2.val;
                l2 = l2.next;
            }else if(l2 == null){
                val = l1.val;
                l1 = l1.next;
            }else{
                val = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(carry != 0){
                val = carry + val;
            }
            carry = val / 10;
            val = val% 10;
            result = new ListNode(val);
            tail.next = result;
            tail = tail.next;
            val = 0;
            
        }
        if(carry != 0 && tail.next == null){
            result = new ListNode(carry);
            tail.next = result;
            tail = tail.next;
        }
        
        return dummy.next;
    }

}