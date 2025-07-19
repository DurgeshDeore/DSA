
class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            int j=i+1, k=n-1;
            while(j<k){
                int sum =arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    res.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k] ==arr[k+1]) k--;
                }
            }
        }
        return res;
    }
}
