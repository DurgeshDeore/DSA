class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if(target == 'z' || letters[n-1] <= target) return letters[0];
        int diff = Integer.MAX_VALUE;
        char res = target;
        for(char c: letters){
            if(c > target){
                // int curDiff = c - target;
                // if(diff < curDiff && curDiff != 0){
                //     diff = curDiff;
                //     res = c;
                // }
                return c;
            }
        }
        return res;
    }
}
