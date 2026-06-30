class Solution {
    public int numberOfSubstrings(String s) {
        //approach 1: brute force n^2;
        int n=s.length(), l=0, res=0;
        // for(int i=0; i<n; i++){
        //     HashMap<Character, Integer> map = new HashMap<>();
        //     for(int j=i; j<n; j++){
        //         map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
        //         if(map.size() == 3) res += 1;
        //     }
        // }
        //approach 2: sliding window
        HashMap<Character, Integer> map = new HashMap<>();
        for(int r=0; r<n; r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
            while(map.size()==3 && l<r){
                res += (n-r);
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)-1);
                if(map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
                l+= 1;
            }
        }
        //approach 3: compute
        // ArrayList<Integer> a = new ArrayList<>();
        // ArrayList<Integer> b = new ArrayList<>();
        // ArrayList<Integer> c = new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     if(s.charAt(i) == 'a') a.add(i);
        //     else if(s.charAt(i) == 'b') b.add(i);
        //     else c.add(i);
        // }
        return res;
    }
}
