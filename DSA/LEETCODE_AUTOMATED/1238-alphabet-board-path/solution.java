class Solution {
    public String alphabetBoardPath(String target) {
        String[] str = {"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};
        // HashMap<Character, Integer> map = new HashMMap<>();
        int[] pos = {0, 0};
        StringBuilder sb = new StringBuilder();
        for(char c: target.toCharArray()){
            int indx = c-'a';
            int[] curPos = {indx/5, indx%5};
            if(c != 'z'){
                if(pos[0]-curPos[0] < 0){
                for(int i=0; i< Math.abs(pos[0]-curPos[0]); i++) sb.append('D');
                }else{
                    for(int i=0; i< Math.abs(pos[0]-curPos[0]); i++) sb.append('U');
                }
                if(pos[1]-curPos[1] < 0){
                    for(int i=0; i< Math.abs(pos[1]-curPos[1]); i++) sb.append('R');
                }else{
                    for(int i=0; i< Math.abs(pos[1]-curPos[1]); i++) sb.append('L');
                }
            }else{
                for(int i=pos[1]; i>0; i--) sb.append('L');
                for(int i=pos[0]; i<5; i++) sb.append('D');
            }
            pos = curPos;
            sb.append('!');
        }
        return sb.toString();
    }
}
