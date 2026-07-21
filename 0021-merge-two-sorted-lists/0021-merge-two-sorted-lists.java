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

 //compare 
 //take the chosen value , and move the one which we have chosen 
 //movie until both heads nodes are null
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        ListNode j = list1;
        ListNode k = list2;
        
        while(j != null && k != null){
            if(j.val <= k.val){
                tail.next = j;
                tail = tail.next;
                j = j.next;
            }else{
                tail.next = k;
                tail = tail.next; 
                k = k.next;
            }

        }

        if(k != null){
            tail.next = k;
        }else{
            tail.next = j;
        }

        

        return dummy.next;

        
    }
}