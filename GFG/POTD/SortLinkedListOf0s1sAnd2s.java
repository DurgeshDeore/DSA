class Solution {
    static Node segregate(Node head) {
        int[] freq = new int[3];
        Node ptr = head;
        while(ptr != null){
            freq[ptr.data]++;
            ptr = ptr.next;
        }
        ptr = head;
        int i=0;
        while(ptr != null){
            while(freq[i] != 0 && ptr != null){
                ptr.data = i;
                freq[i]--;
                ptr = ptr.next;
            }
            i++;
        }
        return head;
    }
}
