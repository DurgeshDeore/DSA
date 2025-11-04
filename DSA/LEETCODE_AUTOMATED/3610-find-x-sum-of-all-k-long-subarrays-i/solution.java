class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        if(n<x){
            int[] temp = new int[1];
            for(int i: nums) temp[0]+=i;
            return temp;
        }
        int[] ans= new int[n-k+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        
        int i=0, j=k, l=0;
        while(j<=n){
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
                int freqA = map.get(a), freqB = map.get(b);
                if (freqA != freqB) {
                    return freqB - freqA; 
                } else {
                    return b - a;         
                }

            });

            for (int key : map.keySet()) pq.add(key);

            int c=0, sum=0;
            while (!pq.isEmpty() && c < x) {
                int val = pq.poll();
                sum += val * map.get(val);
                c++;
            }
            ans[l++] = sum;
            if (j == n) break;
            map.put(nums[i], map.get(nums[i]) - 1);
            if (map.get(nums[i]) == 0) map.remove(nums[i]);
            i++;
            map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
            j++;
        }
        return ans;
    }
}
