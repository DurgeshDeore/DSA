//method = use of inbuilt ds
class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        ArrayList<Integer> res= new ArrayList<>();
        if(head == null){
            return false;
        }
        Node temp=head;
        while(temp!=null){ //O(n)
            res.add(temp.data);
            temp = temp.next;
        }
        int l=0,r=res.size()-1;
        while(l<r){  //O(n)
            if(!res.get(l).equals(res.get(r))){ //check left element with right
                return false;
            }
            l++;
            r--;
        }
        return true; 
    } 
}
