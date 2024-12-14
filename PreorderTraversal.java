//method = use helper function
class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(ans,root);
        return ans;
        
    }
    static ArrayList<Integer> helper(ArrayList<Integer> ans,Node root) { //for recurssion
        if(root == null){
            return ans;
        }
        ans.add(root.data);
        helper(ans,root.left);
        helper(ans,root.right);
        return ans;
    }
}
