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
    public void reorderList(ListNode head) {
        if(head == null) return;
        boolean flag = true;
        List<Integer> values = new ArrayList<>();
        for(ListNode cur=head; cur!=null; cur=cur.next){
            values.add(cur.val);
        }
        int i=0, j=values.size()-1;
        for(ListNode cur=head; cur!=null; cur=cur.next){
            if(flag){
                cur.val = values.get(i++);
            }else{
                cur.val = values.get(j--);
            }
            flag = !flag;
        }
    }
}
