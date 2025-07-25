class Solution {
    
    public int getMax(int[] arr){
        int sum = arr[0], res=arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum+arr[i]);
            res = Math.max(res, sum);
        }
        return res;
    }
    public int getMin(int[] arr){
        int sum = arr[0], res=arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.min(arr[i], sum+arr[i]);
            res = Math.min(res, sum);
        }
        return res;
    }
    public int getTotal(int[] arr){
        int res=0;
        for(int i:arr){
            res+=i;
        }
        return res;
    }
    public int maxCircularSum(int arr[]) {
        int min=getMin(arr), max=getMax(arr), total=getTotal(arr);
        if(total==min) return max;
        return Math.max(max, total-min);
    }

// not optimal
    // public int getSum(int arr[], int pos) {
    //     int res=Integer.MIN_VALUE, sum=0;
    //     for(int i=pos; i<arr.length; i++){
    //         sum += arr[i];
    //         res = Math.max(res, sum);
    //     }
    //     for(int i=0; i<pos; i++){
    //         sum += arr[i];
    //         res = Math.max(res, sum);
    //     }
    //     return res;
    // }
}
