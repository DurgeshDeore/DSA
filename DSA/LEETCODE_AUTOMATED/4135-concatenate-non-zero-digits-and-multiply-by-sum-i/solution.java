class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        String num = Integer.toString(n);
        StringBuilder nums = new StringBuilder();
        for(char c: num.toCharArray()){
            if(c != '0'){
                sum += (c - '0');
                nums.append(c);
            }
        }
        return nums.length() == 0? 0: Long.parseLong(nums.toString()) * sum;
    }
}
