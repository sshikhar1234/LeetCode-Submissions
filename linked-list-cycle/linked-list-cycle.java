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
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> map = new HashSet<>();
        ListNode node = head;
        while(head !=null ){
            if(map.contains(head)){
                return true;
            }
            map.add(head);
            head = head.next;
        }
    return false;
    }
}