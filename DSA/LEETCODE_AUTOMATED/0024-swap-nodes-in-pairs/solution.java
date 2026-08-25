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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        // ListNode dummy = new ListNode(-1);
        // dummy.next = head;
        // ListNode curNode = dummy;
        // while(curNode.next != null && curNode.next.next != null){
        //     ListNode first = curNode.next;
        //     ListNode second = curNode.next.next;

        //     first.next = second.next;
        //     second.next = first;
        //     curNode.next = second;

        //     curNode = first;
        // }
        // return dummy.next;
        ListNode first = head;
        ListNode second = head.next;
        first.next = swapPairs(head.next.next);
        // second.next = first;
        second.next = first;
        return second;
    }
}
