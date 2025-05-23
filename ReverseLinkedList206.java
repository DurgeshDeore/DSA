//method = using inbuilt ds stack
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        Stack<Integer> st= new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp = head;
         while(temp!=null){
            temp.val=st.pop();
            temp=temp.next;
         }
         return head;
    }
}
