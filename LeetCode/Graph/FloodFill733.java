class Solution {
    public void helper(int[][] image, int sr, int sc, int color, int orgCol){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || orgCol != image[sr][sc]){
            return;
        }
        image[sr][sc] = color;
        helper(image, sr, sc-1, color, orgCol);
        helper(image, sr, sc+1, color, orgCol);
        helper(image, sr-1, sc, color, orgCol);
        helper(image, sr+1, sc, color, orgCol); 
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgCol = image[sr][sc];
        if(color != orgCol){
            helper(image, sr, sc, color, orgCol);
        }
        return image;
    }
}
