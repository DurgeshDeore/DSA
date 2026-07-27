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
    public ListNode insertionSortList(ListNode head) {
        int indx = 0;
        ArrayList<Integer> lst = new ArrayList<>();
        for(ListNode i = head; i != null; i = i.next) {
            lst.add(i.val);
        }
        // Collections.sort(lst); // brute force

        // approach 2: insertion sort
        for(int i=0; i<lst.size(); i++){
            int ele = lst.get(i), j=i-1;
            while(j >= 0 && lst.get(j) > ele){
                lst.set(j+1, lst.get(j));
                j-=1;
            }
            lst.set(j+1, ele);
        }
        for(ListNode i = head; i != null && indx < lst.size(); i = i.next, indx++) i.val = lst.get(indx);
        return head;
    }
}
