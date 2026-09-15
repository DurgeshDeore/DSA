class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> lost = new HashSet<>(); 
        HashMap<Integer, Integer> losers = new HashMap<>(); 
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> t1 = new HashSet<>(); 
        HashSet<Integer> t2 = new HashSet<>(); 

        res.add(new ArrayList<>()); //win
        res.add(new ArrayList<>()); //lose

        for(int[] match: matches){
            lost.add(match[1]);
            losers.put(match[1], losers.getOrDefault(match[1], 0)+1);
        }
        for(int[] match: matches){
            if(!lost.contains(match[0])) t1.add(match[0]);         
            if(losers.get(match[1]) == 1) t2.add(match[1]);
        }
        for(int i: t1) res.get(0).add(i); 
        for(int i: t2) res.get(1).add(i); 
        
        Collections.sort(res.get(0));
        Collections.sort(res.get(1));
        return res;
    }
}
