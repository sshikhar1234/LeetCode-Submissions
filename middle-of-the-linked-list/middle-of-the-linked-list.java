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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode currentNode = head;
        while(head != null){
            head = head.next;
            length++;
        }
        int med = length/2;
        while(currentNode != null && med >0){
        currentNode = currentNode.next;
        med--; 
        }
        return currentNode;
    }
}