//64.37
class Solution {
    public int getSquareSum(int n){
        int sum=0;
        while(n!=0){
            int ld=n%10;
            sum+=ld*ld;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        // HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> set = new ArrayList<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=getSquareSum(n);
        }
        return n==1;
    }
}
