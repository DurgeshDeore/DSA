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
    public ListNode reverseKGroup(ListNode head, int k) {
        int i=0;
        ListNode l=head;
        ListNode r=head;
        Stack<Integer> st = new Stack<>();

        while(l!=null && r!=null){
            i=0;
            while(i<k && r!=null){
                i++;
                st.push(r.val);
                r=r.next;
            }
            if(st.size() == k){
                while(i > 0){
                    i--;
                    l.val = st.pop();
                    l = l.next;
                }
            }
        }
        return head;
    }
}
