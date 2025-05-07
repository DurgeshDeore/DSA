class Solution {
    public static void constructPath(Node root, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res){
        if(root == null){
            return ;
        }
        temp.add(root.data);
        if(root.left == null && root.right == null){
            res.add(new ArrayList<>(temp));
            // temp.clear();
        }else{
            constructPath(root.left, temp, res);
            constructPath(root.right, temp, res);
        }
        temp.remove(temp.size()-1);
        // return;
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        constructPath(root, temp, res);
        return res;
    }
}
