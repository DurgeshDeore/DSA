class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char ch = board[i][j];
                if(ch == '.') continue;
                int boxIndx = (i/3)*3 + (j/3);
                if(rows[i].contains(ch) || cols[j].contains(ch) || boxes[boxIndx].contains(ch)){
                    return false;
                }
                rows[i].add(ch);
                cols[j].add(ch);
                boxes[boxIndx].add(ch);
            }
        }
        return true;
    }
}
