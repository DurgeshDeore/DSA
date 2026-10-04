class Solution {
    public boolean inDia(int[] source, int[] target){
        int x=target[0], y=target[1];
        for(int i=source[0], j=source[1]; i<9 && j<9; i++, j++){
            if(i == x && j == y) return true;
        }
        for(int i=source[0], j=source[1]; i>0 && j>0; i--, j--){
            if(i == x && j == y) return true;
        }
        for(int i=source[0], j=source[1]; i<9 && j>0; i++, j--){
            if(i == x && j == y) return true;
        }
        for(int i=source[0], j=source[1]; i>0 && j<9; i--, j++){
            if(i == x && j == y) return true;
        }
        return false;
    }
    public boolean inDir(int[] source, int[] target){
        int x=target[0], y=target[1];
        if(source[0] == x || source[1] == y) return true;
        return false;
    }
    public int minQueenMoves(int[] source, int[] target) {
        if(source[0] == target[0] && source[1] == target[1]) return 0;
        if(inDir(source, target)) return 1;
        if(inDia(source, target)) return 1;
        return 2;
    }
}
