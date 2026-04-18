class Solution {
    public int revNum(int n){
        String num = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(int i=num.length()-1; i>=0; i--)   
            sb.append(num.charAt(i));
        return Integer.parseInt(sb.toString());
    }
    public int mirrorDistance(int n) {
        return Math.abs(revNum(n) - n);
    }
}
