//method = hashing
//better appraocah
class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k){
            return false;
        }
        int cnt=0;
        HashMap<Character, Integer> map =new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int ele: map.values()){
            if( ele%2 == 1 ){
                cnt++;
            }
        }
        return cnt<=k;
    }
}
