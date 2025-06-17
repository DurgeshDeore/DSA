class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder("");
        while(columnNumber > 0){
            columnNumber--;
            int rem = columnNumber%26;
            res.append((char)('A'+rem));
            columnNumber/=26;
        }
        return res.reverse().toString();
    }
}
