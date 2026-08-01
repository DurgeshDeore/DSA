class Solution {
    public int maxProduct(String[] words) {
        int n = words.length, maxProd = 0;
        // approach 1: Brute Froce O(n^2)
        ArrayList<HashSet<Character>> freq = new ArrayList<>();
        for(String word: words){
            HashSet<Character> set = new HashSet<>();
            for(char c: word.toCharArray()) set.add(c);
            freq.add(set);
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                boolean flag = true;
                for(char c: freq.get(j)){
                    if(freq.get(i).contains(c)){
                        flag = false;
                        break;
                    }
                }
                if(flag) maxProd = Math.max(maxProd, words[i].length() * words[j].length());
            }
        }
        return maxProd; 
    }
}
