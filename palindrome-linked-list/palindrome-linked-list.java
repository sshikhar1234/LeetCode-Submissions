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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head !=null){
            list.add(head.val);
            head = head.next;
        }
        System.out.println(list);
        int p1 = 0;
        int p2 = list.size() - 1;
        while(p1<p2){
            if(list.get(p1) == list.get(p2)){
                p1++;
                p2--;
            }else return false;
        }
    return true;
    }
}