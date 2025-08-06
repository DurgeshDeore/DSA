class Solution {
    public int romanToDecimal(String s) {
        int res=0, prev=0;
        Map<Character, Integer> romanMap = new HashMap<>();
        // romanMap.put('-', 0);
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        for (int i = s.length() - 1; i >= 0; i--){
            int cur=romanMap.get(s.charAt(i));
            if(cur<prev){
                res-=cur;
            }else{
                res+=cur;
            }
            prev=cur;
        }
        return res;
    }
}
