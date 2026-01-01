/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
        int len = 0;
        for(;head != null; head=head.next) len++;
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n = length(headA), m = length(headB);
        if(n > m){
            for(int i=0, diff=n-m; i<diff; headA=headA.next)
                i++;
        }else if(m>n){
            for(int i=0, diff=m-n; i<diff; headB=headB.next)
                i++;
        }
        while(headA != headB){
            headB=headB.next;
            headA=headA.next;
        }
        return headA;
    }
}
