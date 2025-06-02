class Solution {
    public void reorderList(ListNode head) {
        // sc O(n) tc O(n)
        // 13.12 %
        if(head == null) return;
        boolean flag = true;
        List<Integer> values = new ArrayList<>();
        for(ListNode cur=head; cur!=null; cur=cur.next){
            values.add(cur.val);
        }
        int i=0, j=values.size()-1;
        for(ListNode cur=head; cur!=null; cur=cur.next){
            if(flag){
                cur.val = values.get(i++);
            }else{
                cur.val = values.get(j--);
            }
            flag = !flag;
        }
        
    }

}
