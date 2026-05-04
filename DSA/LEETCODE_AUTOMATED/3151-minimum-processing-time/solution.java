class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int res = Integer.MIN_VALUE, j=0, k=0;
        Collections.sort(tasks, Collections.reverseOrder());
        Collections.sort(processorTime);
        for(int i=0; i<tasks.size(); i++){
            if(k==4){
                k=0;
                j++;
            }
            int cur = processorTime.get(j)+ tasks.get(i);
            res = Math.max(res, cur);
            k++;
        }
        return res;
    }
}
