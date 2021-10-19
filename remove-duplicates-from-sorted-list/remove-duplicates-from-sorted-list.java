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
        ListNode ptr = head;
        while(ptr !=null && ptr.next !=null){
            if(ptr.val == ptr.next.val){
                ListNode temp = ptr.next.next;
                ptr.next.next = null;
                ptr.next = temp;
            }else{
            ptr = ptr.next;                                
            }
        }
        return head;
    }
}