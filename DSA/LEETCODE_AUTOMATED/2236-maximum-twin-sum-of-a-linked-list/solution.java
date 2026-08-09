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
    public int pairSum(ListNode head) {
        int sum=0, maxSum=0;
        if(head.next == null) return head.val;
        ListNode cur = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        for(int i=0, j=list.size()-1; i<j; i++, j--){
            sum = list.get(i) + list.get(j);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
