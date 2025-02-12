class Solution {
    ArrayList<Integer> temp=new ArrayList<>();
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        temp.add(root.data);
        inorder(root.right);
    }
    boolean findTarget(Node root, int target) {
        inorder(root);
        int left = 0, right = temp.size() - 1;
        while (left < right) {
            int sum = temp.get(left) + temp.get(right);
            if (sum == target) return true;
            else if (sum < target) left++; 
            else right--;
        }
        return false;
    }
}
