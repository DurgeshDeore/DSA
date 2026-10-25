class Solution {
    public int countStaircase(int[] nums) {
        // hashing 
        int n = nums.length, maxLen = 0, noOfSubArrays = 0;
        
        for(int i=0; i<n; i++){
            
            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> order = new ArrayList<>();
            
            for(int j=i; j<n; j++){
                int num = nums[j]; 
                boolean flag = true;
                if(!map.containsKey(num)){
                    map.put(num, 1);
                    order.add(num);
                }else{
                    map.put(num, map.getOrDefault(num, 0)+1);
                    int indx = order.indexOf(num);
                    if(map.get(num) > indx+1){
                        flag = false;
                    }
                }
                if(!flag) break;
                for(int f=0; f<order.size(); f++){
                    if(map.get(order.get(f)) != f+1){
                        flag = false;
                        break;
                    }
                }
                if(flag) noOfSubArrays += 1;
            }
            
        }
        return noOfSubArrays;
    }
}
