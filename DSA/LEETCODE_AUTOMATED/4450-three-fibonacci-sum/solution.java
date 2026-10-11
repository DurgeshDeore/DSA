class Solution {
    public boolean threeFibonacciSum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i=0; i<n; i++){
            int m = list.size();
            list.add(list.get(m-1) + list.get(m-2));
            m = list.size();
            int sum = list.get(m-1) +list.get(m-2) + list.get(m-3);
            if(sum > n) return false;
            if(sum == n) return true;
        }
        // for(int i=2; i<list.size(); i++){
        //     int sum = list.get(i) +list.get(i-1) + list.get(i-2);
        //     if(sum > n) break;
        //     if(sum == n) return true;
        // }
        return false;
    }
}
