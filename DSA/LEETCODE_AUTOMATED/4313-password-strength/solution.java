class Solution {
    public int passwordStrength(String password) {
        int strength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: password.toCharArray()){
            if(!map.containsKey(c)) {
                int val = 0;
                if('a' <= c && c <= 'z') val += 1;
                else if('A' <= c && c <= 'Z') val += 2;
                else if('0' <= c && c <= '9') val += 3;
                else if(c == '!' || c == '@' || c == '#' || c == '$') val += 5;
                map.put(c, val);
            }
        }
        for(char c: map.keySet()) strength += map.get(c);
        return strength;
    }
    
}
