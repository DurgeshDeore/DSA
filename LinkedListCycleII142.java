//method = slow and fast pointer
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        boolean cycle=false;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle){
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return fast;
        }
        return null;
    }
}
