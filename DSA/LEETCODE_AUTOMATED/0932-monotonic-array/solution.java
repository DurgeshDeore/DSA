class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(n == 1 || n == 2) return true;
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums){
            if(list.size() > 0 && list.get(list.size()-1) == num) continue;
            else list.add(num);
        }
        if(list.size() < 2) return true;
        if(list.get(0) <= list.get(1)){
            for(int i=2; i<list.size(); i++){
                if(list.get(i-1) > list.get(i)) return false;
            }
        }else if(list.get(0) >= list.get(1)){
            for(int i=2; i<list.size(); i++){
                if(list.get(i-1) < list.get(i)) return false;
            }
        }else{
            return false;
        }
        return true;
    }
}
