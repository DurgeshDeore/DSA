//method = freq arr
//better approach
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        if(arr.length <= 1){
            return new ArrayList<>();
        }
        int freq[] = new int[arr.length+1];
        ArrayList<Integer> ans = new ArrayList<>();
        int j=0;
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        int repeated=-1, small_positive=-1;
        for(int i=1; i<freq.length; i++){
            if(freq[i] >= 2){
                repeated=i;
            }
            if(freq[i] == 0){
                small_positive=i;
            }
        }
        ans.add(repeated);
        ans.add(small_positive);
        return ans;
    }
}
