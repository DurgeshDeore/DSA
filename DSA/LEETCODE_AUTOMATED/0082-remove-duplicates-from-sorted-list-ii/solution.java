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
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(head != null){
            boolean flag = false;
            while(head.next != null && head.val == head.next.val){
                head = head.next;
                flag = true;
            }
            if(!flag){
                prev.next = head;
                prev = head;
            }else {
                prev.next = head.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
