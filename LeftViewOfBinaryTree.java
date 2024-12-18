//method =  recurssive halper fuction
// T O(n) 
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans= new ArrayList<>();
        if(root == null){ return ans;}
        return helper(ans, root,0);
    }
    ArrayList<Integer> helper(ArrayList<Integer> ans, Node root, int level){
        
        if(root == null){ return ans;}
        if(level == ans.size()){
            ans.add(root.data);
        }
        helper(ans, root.left , level+1);
        helper(ans, root.right , level+1);
        return ans;
    }
}
