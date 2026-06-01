class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Arrays.sort(candyType);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(set.size() == (n/2)) return (n/2);
            if(!set.contains(candyType[i])) set.add(candyType[i]);
        }
        return set.size();
    }
}
