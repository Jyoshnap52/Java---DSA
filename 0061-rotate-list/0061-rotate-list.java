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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count += 1;
            temp = temp.next; 
        }
    
        k = k % count;
        if(k == 0){
            return head;
        }
        int diff = count - k -1;//len - k = where we have to stop
        ListNode tail = head;
        while(diff != 0){
            diff -= 1;
            tail = tail.next; 
        }
        ListNode j = tail.next;
        ListNode newHead = j;
        tail.next = null;
        while(j != null && j.next != null){
            j = j.next;
        }
        j.next = head;

        return newHead;
        
    }
}