class Solution {
    public int getLen(Node head){
        int len=0;
        while(head != null){
            len++;
            head=head.next;
        }
        return len;
    }

    public Node swapKth(Node head, int k) {
        int len = getLen(head);
        if (k > len) return head;
        if (2*k - 1 == len) return head; 

        Node ptr1 = head;
        for (int i=1; i<k; i++) {
            ptr1 = ptr1.next;
        }

        Node ptr2 = head;
        for (int i=1; i<len-k+1; i++) {
            ptr2 = ptr2.next;
        }

        int temp = ptr1.data;
        ptr1.data = ptr2.data;
        ptr2.data = temp;

        return head;
    }
}
