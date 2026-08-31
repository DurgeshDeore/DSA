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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int size = 0, min = Integer.MAX_VALUE;
        ListNode prev = head;
        ArrayList<Integer> pos = new ArrayList<>();
        for(ListNode cur = head.next; cur.next != null; cur = cur.next){
            size += 1;
            if((prev.val > cur.val && cur.val < cur.next.val)) pos.add(size);
            else if((prev.val < cur.val && cur.val > cur.next.val)) pos.add(size);
            if(pos.size() > 1) min = Math.min(min, pos.get(pos.size()-1) - pos.get(pos.size()-2) );
            prev = cur;
        }
        if(pos.size() < 2) return new int[]{-1, -1};
        // int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE; 
        /* we dont need to traverse, instead we can find the min max
        at time of insertion*/
        // for(int i=0; i<pos.size(); i++){
        //     for(int j=0; j<pos.size(); j++){
        //         if(i!=j){
        //             max = Math.max( max, Math.abs(pos.get(i)-pos.get(j)) );
        //             min = Math.min( min, Math.abs(pos.get(i)-pos.get(j)) );
        //         }
        //     }
        // }
        return new int[]{min, pos.get(pos.size()-1) - pos.get(0)};
    }
}
