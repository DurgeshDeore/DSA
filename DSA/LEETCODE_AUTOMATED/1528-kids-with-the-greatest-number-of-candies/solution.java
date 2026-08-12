class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie = 0;
        List<Boolean> res = new ArrayList<>();

        for(int candie: candies) maxCandie = Math.max(maxCandie, candie);

        for(int candie: candies){
            if(candie+extraCandies >= maxCandie) res.add(true);
            else res.add(false);
        }

        return res;
    }
}
