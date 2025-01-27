//method = two pointer
class Solution {
    public static Node findFirstNode(Node head) {
        if(head == null) return null;
        Node slow=head,fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        slow=head;
        while(fast != null && fast.next != null){
            if(slow == fast){
                return slow;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return null;
    }
}
