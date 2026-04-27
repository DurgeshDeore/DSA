class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0; i<n; i++){
            int j=i+1;
            while(j<n && numbers[i]+numbers[j] < target)
                j++;
            if(j<n && numbers[i]+numbers[j] == target) return new int[]{i+1, j+1};
        }
        // if(numbers[n-2]+numbers[n-1] == target) return new int[]{n-1, n};
        return new int[]{-1, -1};
    }
}
