//method =  use inbuilt ds (stack)
class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        if(head == null){
            return head;
        }
        Node temp=head;
        Stack<Integer> res = new Stack<>();
        while(temp!=null){ //push the item untill linked list is empty
            res.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(!res.isEmpty()){ //pop item untill stack is empty
            temp.data = res.pop();
            temp = temp.next; //update the linked list
        } 
        return head; //return head
    }
}
