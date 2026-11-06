class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c = coordinates.charAt(0);
        int n = Integer.parseInt(coordinates.substring(1));
        if(((c-'a')%2 == 0))
            return n%2 == 0;
        return !(n%2 == 0);
    }
}
