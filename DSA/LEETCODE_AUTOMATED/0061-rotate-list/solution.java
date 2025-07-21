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
        int len=0; 
        ListNode temp=head;
        if(head==null) return head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            len+=1;
            temp=temp.next;
        }
        temp=head;
        k%=len;
        for(int i=len-k; i<len; i++){
            temp.val = arr.get(i);
            temp=temp.next;
        }
        for(int i=0; i<len-k; i++){
            temp.val = arr.get(i);
            temp=temp.next;
        }
        return head;
    }
}
