class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s: strs){
            char temp[] = s.toCharArray();
            Arrays.sort(temp);
            if(!map.containsKey(new String(temp)))
                map.put(new String(temp), new ArrayList<>());
            map.get(new String(temp)).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
