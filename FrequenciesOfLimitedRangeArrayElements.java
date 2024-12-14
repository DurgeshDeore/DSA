//method = freq arr
class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int temp[] = new int[arr.length+1];
        for(int i=0;i<arr.length; i++){
            if(arr[i] >=1 && arr[i]<= arr.length){
                temp[arr[i]]++;
            }
        }
        List<Integer> ans =new ArrayList<>();
        for(int i=1;i<temp.length; i++){
            ans.add(temp[i]);
        }
        return ans;
    }
}
