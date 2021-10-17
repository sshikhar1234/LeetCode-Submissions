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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        int count1 = 0;
        int count2 = 0;
        ListNode mthNode = head;
        ListNode currentNode = head;
        while(currentNode != null){
            int mCount = m;
            int nCount = n;
            while(mCount != 0 && currentNode != null){
                mthNode = currentNode;
                currentNode = currentNode.next;
                mCount--;                
            }
            while(nCount != 0 && currentNode !=null){
                currentNode = currentNode.next;
                nCount--;
            }
        mthNode.next = currentNode;
        }
        return head;
    }
}