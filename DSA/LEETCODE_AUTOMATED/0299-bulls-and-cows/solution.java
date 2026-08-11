class Solution {
    public String getHint(String secret, String guess) {
        int n = secret.length(), bulls = 0, cows = 0;
        StringBuilder sb = new StringBuilder("");
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<n; i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls += 1;
            }else{
                map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0)+1);
            }
        }

        for(int i=0; i<n; i++){
            if(secret.charAt(i) == guess.charAt(i)){
                continue;
            }else{
                map2.put(guess.charAt(i), map2.getOrDefault(guess.charAt(i), 0)+1);
            }
        }

        for(char c: map2.keySet()){
            if(map.containsKey(c)){
                cows += Math.min(map.get(c) ,map2.get(c));
            }
        }

        sb.append(bulls + "A");
        sb.append(cows + "B");

        return sb.toString();
    }
}
