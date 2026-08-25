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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return head;
        int size = 0;
        for(ListNode cur=head; cur != null; cur = cur.next) size+=1;
        ListNode first = head;
        for(int i=0; i<k-1; i+=1) first = first.next;
        ListNode second = head;
        for(int i=0; i<(size-k); i+=1) second = second.next;
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}
