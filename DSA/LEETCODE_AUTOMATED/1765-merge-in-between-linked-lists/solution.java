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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int s=1, e=1;
        ListNode start = list1;
        ListNode end = list1;
        ListNode end2 = list2;
        for(int i=0; i<a-1; i++) start = start.next;
        for(int i=0; i<b; i++) end = end.next;
        while(end2.next != null) end2 = end2.next;
        start.next = list2;
        end2.next = end.next;
        return list1;
    }
}
