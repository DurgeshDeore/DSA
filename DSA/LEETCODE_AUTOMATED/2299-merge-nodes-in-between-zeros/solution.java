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
    public ListNode mergeNodes(ListNode head) {
        if(head==null || head.next == null);

        int sum = 0;
        ListNode cur = head.next;
        ListNode dummy = new ListNode(-1);
        ListNode head2 = dummy;

        while(cur!=null){
            if(cur.val == 0){
                dummy.next = new ListNode(sum);
                dummy = dummy.next;
                sum = 0;
            }
            sum += cur.val;
            cur = cur.next;
        }
        return head2.next;
    }
}
