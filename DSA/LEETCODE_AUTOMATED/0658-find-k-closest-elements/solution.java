class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i=0;
        int[] temp = new int[k];
        List<Integer> res = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[1]==b[1])
                return a[0]-b[0];
            return a[1]-b[1];
        });

        for(int a: arr)
            pq.add(new int[]{a, Math.abs(x-a)});

        while(i<k){
            // res.add(pq.poll()[0]);
            temp[i++] = pq.poll()[0];
            // i++;
        }

        Arrays.sort(temp);
        for(int t: temp)
            res.add(t);
        
        return res;
    }
}
