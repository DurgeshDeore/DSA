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
    public ListNode partition(ListNode head, int x) {
        // Brute force
        ListNode cur = new ListNode(-1);
        ListNode dummy = cur;
        ListNode i = head;
        while(i != null){
            if(i.val < x){
                ListNode newNode = new ListNode(i.val);
                cur.next = newNode;
                cur = cur.next;
            }
            i = i.next;
        }
        i = head;
        while(i != null){
            if(i.val >= x){
                ListNode newNode = new ListNode(i.val);
                cur.next = newNode;
                cur = cur.next;
            }
            i = i.next;
        }
        return dummy.next;
    }
}
