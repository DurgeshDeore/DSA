//method= two pointer
class Solution {
    boolean isCircular(Node head) {
        Node stop=head;
        Node move=head.next;
        while(move != null){
            if(move == stop){
                return true;
            }
            move=move.next;
        }
        return false;
    }
}
