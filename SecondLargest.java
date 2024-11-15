//method = use inbuilt ds
class Solution {
    public int getSecondLargest(int[] arr) {
        Set<Integer> sortedArr = new TreeSet<>(); //treeset for sorting
        for(int ele: arr){
            sortedArr.add(ele);
        }
        int cnt=0;
        int sl=sortedArr.size()-2; //find n-2 mean second largest element
        for(int ele: sortedArr){
            if(cnt == sl){ //return if it found
                return ele;
            }
            cnt++;
        }
        return -1; //return -1 if doesn't exist
    }
}
