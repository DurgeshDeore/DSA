//method -trie
class Solution {
    boolean isLeaf(Node node) {
        return node.right==null && node.left==null;
    }
    
    void leftNode(Node node,ArrayList<Integer> res) {
        if(node==null) return;
        
        if(!isLeaf(node)) res.add(node.data);
    
        if (node.left != null) leftNode(node.left, res);
        else if (node.right != null) leftNode(node.right, res);
    }
    
    void leafNode(Node node,ArrayList<Integer> res) {
        if(node==null) return;
        
        if(isLeaf(node)){
            res.add(node.data);
            return;
        }
        
        leafNode(node.left,res);
        leafNode(node.right,res);
    }
    
    void rightNode(Node node,ArrayList<Integer> res) {
        if(node==null) return;
        
        if (node.right != null) rightNode(node.right, res);
        else if (node.left != null) rightNode(node.left, res);
        
        if(!isLeaf(node)) res.add(node.data);

    }
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> res=new ArrayList<>();
        
        if(!isLeaf(node)) res.add(node.data);
        
        leftNode(node.left,res);
        leafNode(node,res);
        rightNode(node.right,res);
        return res;
    }
}
