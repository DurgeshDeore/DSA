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
    public int getDecimalValue(ListNode head) {
        StringBuffer temp = new StringBuffer("");
        while(head != null){
            temp.append(head.val);
            head = head.next;
        }
        String num = temp.toString();
        int cur = 1, res = 0;
        for(int n = num.length()-1; n>=0; n--){
            if(num.charAt(n) == '1'){
                res += cur;
            }
            cur = cur*2;
        }
        return res;
    }
}
