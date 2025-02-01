//method = hashing
//optimized apprroach
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode nullPtr=null;
        ListNode temp=headA;
        while(temp!=null){
            map.put(temp,1);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(map.containsKey(temp)) return temp;
            temp=temp.next;
        }
        return nullPtr;
    }
}
