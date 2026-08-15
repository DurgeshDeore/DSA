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
    public ListNode oddEvenList(ListNode head) {
        // Brute Force: construct new list
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode odd = head;
        ListNode even = head.next;
        ListNode cur = dummy;
        while(odd != null ){
            cur.next = new ListNode(odd.val);
            cur = cur.next;
            if(odd.next == null) break;
            odd = odd.next.next;
        }
        while(even != null ){
            cur.next = new ListNode(even.val);
            cur = cur.next;
            if(even.next == null) break;
            even = even.next.next;
        }
        return dummy.next;
    }
}
