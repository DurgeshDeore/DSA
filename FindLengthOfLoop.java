//method = slow  & fast pointer
class Solution {
    public Node detectLoop(Node head) {
        Node slow=head, fast=head, nullptr=null;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast) {
                slow=head;
                while(slow!=fast){
                   slow=slow.next;
                   fast=fast.next;
                }
                return slow;
            }
        }
        return nullptr;
    }
    public int countNodesinLoop(Node head) {
        int n=1;
        Node startNode=detectLoop(head);
        if(detectLoop(head) == null){
            return 0;
        }
        Node temp=startNode.next;
        while(temp!=startNode){
            n++;
            temp=temp.next;
        }
        return n;
    }
}
