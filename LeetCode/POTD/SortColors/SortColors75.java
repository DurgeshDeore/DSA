class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length, i=0, j=0;
        int freq[] = new int[3];
        for(int x: nums) freq[x]++;
        while(i<3){
            while(freq[i]>0){
                nums[j]=i;
                j++;
                freq[i]--;
            }
            i++;
        }
    }
}
