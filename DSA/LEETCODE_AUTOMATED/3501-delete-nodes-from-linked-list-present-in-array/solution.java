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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n=nums.length;

        if(n==0 || head==null)
            return head;
        
        Set<Integer> set=new HashSet<>();
        for(int i: nums) set.add(i);

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, cur = head;

        while(cur != null){
            if(set.contains(cur.val)){
                prev.next = cur.next;
            }else{
                prev = cur;
            }
            cur = cur.next;
        }

        return dummy.next;
    }
}
