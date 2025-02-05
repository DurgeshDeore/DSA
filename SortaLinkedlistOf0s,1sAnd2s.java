class Solution {
    static Node segregate(Node head) {
        int[] freq = new int[3];
        Node temp = head;
        while(temp != null){
            freq[temp.data]++;
            temp=temp.next;
        }
        temp=head;
        temp = head;
        for (int i = 0; i < 3; i++) {
            while (freq[i]-- > 0) {
                temp.data = i;
                temp = temp.next;
            }
        }
        return head;
    }
}
