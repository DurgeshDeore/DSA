//method = hashing
class Solution {
    public int digitSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int maxSum=-1;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int ele:nums){
            int digit_sum=digitSum(ele);
            if(map.containsKey(digit_sum)){
                maxSum=Math.max(map.get(digit_sum)+ele ,maxSum);
                map.put(digit_sum,Math.max(map.get(digit_sum),ele));
            }else{
                map.put(digit_sum,ele);
            }
        }
        return maxSum;
    }
}
