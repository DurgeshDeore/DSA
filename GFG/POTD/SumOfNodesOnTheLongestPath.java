class Solution {
    public void helper(Node root, ArrayList<int[]> res, int sum, int height){
        if(root == null){
            return;
        }
        sum+=root.data;
        if(root.left == null && root.right == null){
            res.add(new int[]{height, sum});
        }
        helper(root.left, res, sum, height+1);
        helper(root.right, res, sum, height+1);
        // return sum;
    }
    public int sumOfLongRootToLeafPath(Node root) {
        int sum=0;
        ArrayList<int []> res = new ArrayList<>();
        helper(root, res, sum, 0);
        Collections.sort(res, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];
            return b[0] - a[0];
        });
        return res.get(0)[1];
    }
}
