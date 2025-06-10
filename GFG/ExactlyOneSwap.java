class Solution {
    int countStrings(String s) {
        // brute force n^2
        // Set<String> unique = new HashSet<>();
        // int n = s.length();
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         char[] str = s.toCharArray();
                
        //         char temp = str[i];
        //         str[i] = str[j];
        //         str[j] = temp;
                
        //         unique.add(new String(str));
                
        //         temp = str[i];
        //         str[i] = str[j];
        //         str[j] = temp;
        //     }
        // }
        // return unique.size();
        int[] freq = new int[26];
        int n = s.length();
        boolean hasDuplicate = false;
        for(int i=0; i<n; i++){
            freq[s.charAt(i)-'a']++;
            if(freq[s.charAt(i)-'a'] >= 2) hasDuplicate = true;
        }
        
        int totalPair = n*(n-1)/2, duplicatePairs = 0;
        for(int cnt: freq){
            if(cnt >= 2){
                duplicatePairs += cnt * (cnt-1)/2;
            }
        }
        int res = totalPair - duplicatePairs;
        if(hasDuplicate) return res+1;
        return res;
    }
}
