class Solution {
    public boolean isLengthEven(Node head) {
        int len = 0;
        if(head == null){
            return false;
        }
        for(Node temp = head; temp != null; temp = temp.next){
            len++;
        }
        return (len%2) == 0 ? true: false;
    }
}
