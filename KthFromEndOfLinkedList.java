//method = use inbuilt ds
class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        if(head==null){ //if ll isempty
            return -1;
        }
        ArrayList<Integer> res=new ArrayList<>(); //create arrlst to store all data of ll
        Node temp=head;
        while(temp!=null){ 
            res.add(temp.data);
            temp=temp.next;
        }
        int n = res.size();
        if(n<k){ //if n is less than k return -1
            return -1;
        }
        return res.get(n-k); //return n-k as result
    }
}
