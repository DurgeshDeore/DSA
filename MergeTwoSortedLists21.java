//method = dummy ptr
//optimized 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr=null,head=null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val <= list2.val){
            curr=list1;
            head=curr;
            list1=list1.next;
        }else{
            curr=list2;
            head=curr;
            list2=list2.next;
        }
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next=list1;
                list1=list1.next;
                curr=curr.next;
            }else{
                curr.next=list2;
                list2=list2.next;
                curr=curr.next;
            }
        }
        if(list1 != null){
            curr.next=list1;
        }
        if(list2 !=null){
            curr.next=list2;
        }
        return head;
    }
}
