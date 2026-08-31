class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        for(int i=source[0], j=source[1]; i<9 && j<9; i++, j++){ // dia up right
            if(target[0] == i && target[1] == j) return 1;
        }
        for(int i=source[0], j=source[1]; i<9 && j>0; i++, j--){ // dia up left
            if(target[0] == i && target[1] == j) return 1;
        }
        for(int i=source[0], j=source[1]; i>0 && j<9; i--, j++){ // dia down right
            if(target[0] == i && target[1] == j) return 1;
        }
        for(int i=source[0], j=source[1]; i>0 && j>0; i--, j--){ // dia down left
            if(target[0] == i && target[1] == j) return 1;
        }
        for(int i=source[0], j=source[1]; i>0 && j<9; i--, j++){
            for(int k=i-1, l=j-1; k>0 && l>0; k--, l--){
                if(target[0] == k && target[1] == l) return 2;
            }
            for(int k=i+1, l=j+1; k<9 && l<9; k++, l++){
                if(target[0] == k && target[1] == l) return 2;
            }
        }
        for(int i=source[0], j=source[1]; i<9 && j>0; i++, j--){
            for(int k=i-1, l=j-1; k>0 && l>0; k--, l--){
                if(target[0] == k && target[1] == l) return 2;
            }
            for(int k=i+1, l=j+1; k<9 && l<9; k++, l++){
                if(target[0] == k && target[1] == l) return 2;
            }
        }
        for(int i=source[0], j=source[1]; i<9 && j<9; i++, j++){
            for(int k=i-1, l=j+1; k>0 && l<9; k--, l++){
                if(target[0] == k && target[1] == l) return 2;
            }
            for(int k=i+1, l=j-1; k<9 && l>0; k++, l--){
                if(target[0] == k && target[1] == l) return 2;
            }
        }
        for(int i=source[0], j=source[1]; i>0 && j>0; i--, j--){
            for(int k=i+1, l=j-1; k>0 && l>0; k++, l--){
                if(target[0] == k && target[1] == l) return 2;
            }
            for(int k=i-1, l=j+1; k<9 && l<9; k--, l++){
                if(target[0] == k && target[1] == l) return 2;
            }
        }
        return -1;
    }
}
