class Solution {
    public String convert(String s, int numRows) {
        int n=s.length(), indx=0, i=0, j=0;
        if(numRows == 1) return s;
        char[][] grid = new char[numRows][n];
        StringBuilder sb = new StringBuilder("");
        while(indx<n){
            for(i=0; i<numRows && indx<n; i++){
                grid[i][j] = s.charAt(indx);
                indx++; 
            }
            j+=1;
            for(i=numRows-2; i>0 && indx<n; i--){
                grid[i][j] = s.charAt(indx);
                j++; 
                indx++;
            }
        }
        for(i=0; i<numRows; i++){
            for(j=0; j<n; j++){
                if(grid[i][j] != '\u0000') sb.append(grid[i][j]);
            }
        }
        return sb.toString();
    }
}
