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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null ||k==0) return head;
        int size=1, i=1;
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
            size += 1;
        }
        k=k%size;
        cur.next = head;
        ListNode temp = head;
        while(i<(size-k)){
            temp = temp.next;
            i++;
        }
        head = temp.next;
        temp.next = null;
        return head;
        // return cur;
    }
}
