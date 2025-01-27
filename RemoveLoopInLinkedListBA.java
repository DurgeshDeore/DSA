//method = use built in ds
//better approach
//use fast & slow pointers
class Solution {

    public static void removeLoop(Node head) {
        if(head==null || head.next==null) return;
        
        HashSet<Node> arr= new HashSet<>();
        Node prev=null,temp=head;
        while(temp!=null){
            if(arr.contains(temp)){
                prev.next=null;
                return;
            }else{
                arr.add(temp);
            }
            prev=temp;
            temp=temp.next;
        }
    }
}
