//method = recurssion
class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        int lh,rh;
        if(node == null){ //if bst is empty
            return 0;
        }
        lh = height(node.left); //calculate left height
        rh = height(node.right); //calculate rright heigh
        return lh>rh? lh+1: rh+1; //add 1 for root and return max height
    }
}
