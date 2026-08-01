class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n = nums.length;
        // Brute Force: Convert into int then sort;
        // RTE (165/219) java.base/java.lang.NumberFormatException.forInputString
        // long[] numbers = new long[n];
        // for(int i=0; i<n; i++) numbers[i] = Long.parseLong(nums[i]);
        // Arrays.sort(numbers);
        // return String.valueOf(numbers[n-k]);

        // approach 2: Use Heap sort O(m* log n)
        PriorityQueue<String> maxHeap = new PriorityQueue<>((a, b) -> {
            int lengthCompare = Integer.compare(b.length(), a.length());
            if (lengthCompare != 0) {
                return lengthCompare;
            }
            return b.compareTo(a);
        });
        for(String num: nums) maxHeap.add(num);
        while(k>1){
            maxHeap.poll();
            k--;
        }
        return String.valueOf(maxHeap.poll());
    }
}
