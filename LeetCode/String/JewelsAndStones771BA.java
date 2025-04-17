//58.86%
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: jewels.toCharArray()){
            // map.put(ch, map.getOrDefalult(ch,0)+1);
            map.put(ch,1);
        }
        for(char ch: stones.toCharArray()){
            if(map.containsKey(ch)){
                cnt++;
            }
        }
        return cnt;
    }
}
