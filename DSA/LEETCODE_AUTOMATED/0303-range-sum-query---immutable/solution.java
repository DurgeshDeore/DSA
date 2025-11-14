class NumArray {

    public int[] arr;
    public int[] tree;
    public NumArray(int[] nums) {
        arr = nums;
        tree = new int[arr.length * 4];
        build(0,0,arr.length-1);
    }   

    public void build(int i, int start, int end){
        if(end == start){
            tree[i] = arr[start];
            return;
        }
        int mid = (start + end)/2;
        build(2*i+1, start, mid);
        build(2*i+2, mid+1, end);
        tree[i] = tree[2*i+1] + tree[2*i+2];

    }
    
    public int sumRange(int left, int right) {
        return getSumRange(0,left, right, 0, arr.length-1);
    }

    public int getSumRange(int i, int left, int right, int start, int end){
        if (right < start || left > end) { return 0; } 
        if (left <= start && end <= right) { return tree[i]; }
        int mid = (start + end)/2;
        int l = getSumRange(2*i+1, left, right, start, mid);
        int r = getSumRange(2*i+2, left, right, mid+1, end);
        return l+r;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
