class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0, prev = -1;
        ArrayList<Integer> laser = new ArrayList<>();
        for(String b: bank){
            int cnt = 0;
            for(char c: b.toCharArray()){
                if(c == '1') cnt += 1;
            }
            if(cnt != 0) laser.add(cnt);
        }
        if(laser.size() <= 1) return 0;
        for(int i: laser){
            if(prev == -1){
                prev = i;
                continue;
            }
            res += (prev*i);
            prev = i;
        }
        return res;
    }
}
