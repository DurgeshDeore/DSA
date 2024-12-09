//brute force
class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuffer tmp = new StringBuffer("");
        ListNode temp = head;
        while(temp!=null){
            tmp.append(temp.val);
            temp=temp.next;
        }
        String str = tmp.toString();
        String rev = new StringBuilder(tmp).reverse().toString();
        if(rev.equals(str)){
            return true;
        }
        return false;
    }
}
