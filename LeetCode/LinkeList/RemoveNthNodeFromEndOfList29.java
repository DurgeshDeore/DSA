class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode cur=head;
        int len=0;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        if(len == 1) return null;
        if(len == n) return head.next;
        cur = head;
        for(int i=0; i<len-n-1;i++){
            cur = cur.next;        }
        if(cur.next != null){
            cur.next = cur.next.next;
        }
        return head;
    }
}
