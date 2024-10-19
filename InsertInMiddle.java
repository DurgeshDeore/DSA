class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node slow = head;
        Node fast = head;
        if( head == null){
            Node newNode = new Node(x);
            head = newNode;
            return head;
        }
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
            Node temp = slow.next;
            Node newNode = new Node(x);
            newNode.next = temp;
            slow.next = newNode;
        return head;
    }
}
