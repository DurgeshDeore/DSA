class Solution {
    public int countBalanced(String[] arr) {
        int res=0;
        Set<Character> vowels=new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt=0;
        map.put(0,1);
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i=0; i<arr.length; i++){
            String s=arr[i];
            int v=0, c=0;
            for(char ch: s.toCharArray()){
                if(vowels.contains(ch)){
                    v++;
                }else{
                    c++;
                }
            }
            cnt+=(v-c);
            res+=map.getOrDefault(cnt, 0);
            map.put(cnt, map.getOrDefault(cnt, 0)+1);
        }
        return res;
    }
}
