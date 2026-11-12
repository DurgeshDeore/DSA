class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int maxLen = 0;
        HashSet<String> set = new HashSet<>();
        for(int n: arr1){
            String s = String.valueOf(n);
            for(int i=1; i<=s.length(); i++){
                set.add(s.substring(0, i));
            }
        }
        for(int n: arr2){
            String s = String.valueOf(n);
            for(int i=1; i<=s.length(); i++){
                if(set.contains(s.substring(0, i))){
                    maxLen = Math.max(maxLen, i);
                }
            }
        }
        return maxLen;
    }
}
