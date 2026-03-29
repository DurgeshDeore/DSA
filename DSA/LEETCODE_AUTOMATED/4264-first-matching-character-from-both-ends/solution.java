class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        int i=0, j=n-1;
        Map<Character, Integer> s1= new HashMap<>();
        Map<Character, Integer> s2= new HashMap<>();
        while(i<=j){
            char c1= s.charAt(i);
            char c2= s.charAt(j);
            // if(s1.containsKey(c1) && s2.containsKey(c1)){
            //     return s1.get(c1);
            // }else if(s1.containsKey(c2) && s2.containsKey(c2)){
            //     return s1.get(c2);
            // }

            // if(!s1.containsKey(c1)){
            //     s1.put(c1, i);
            // }
            // if(!s2.containsKey(c2)){
            //     s2.put(c2, j);
            // }
            if(c1 == c2) return i;
            i++;
            j--;
        }
        return -1;
    }
}
