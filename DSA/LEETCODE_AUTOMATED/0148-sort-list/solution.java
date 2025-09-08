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
    public ListNode mergeSort(ListNode a, ListNode b) {
        if(a == null) return b;
        if(b == null) return a;
        ListNode res;
        if(a.val <= b.val){
            res = a;
            res.next = mergeSort(a.next, b);
        }else{
            res = b;
            res.next = mergeSort(a, b.next);
        }
        return res;
    }
    public ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    } 
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = getMid(head);
        ListNode midNxt = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(midNxt);
        return mergeSort(left, right);
    }
}
