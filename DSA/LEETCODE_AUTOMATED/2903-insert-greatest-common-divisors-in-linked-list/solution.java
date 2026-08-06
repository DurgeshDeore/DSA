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
    public int getGCD(int n, int m){
        // for(int i=Math.min(n,m); i>1; i--){
        //     if((n%i == 0) && (m%i == 0)) return i;
        // }
        // return 1;
        while(m!=0){
            int rem=n % m;
            n=m;
            m=rem;
        }
        return n;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prv = head;
        ListNode nxt = head.next;
        while(nxt != null){
            int gcd = getGCD(prv.val, nxt.val);
            ListNode newNode = new ListNode(gcd);
            prv.next = newNode;
            newNode.next = nxt;
            prv = nxt;
            nxt = nxt.next;
        }
        return head;
    }
}
