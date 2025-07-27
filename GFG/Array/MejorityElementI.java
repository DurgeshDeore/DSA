class Solution {
    int majorityElement(int arr[]) {
        int ele=-1, cnt=0, n=arr.length;
        for(int i: arr){
            if(cnt==0){
                ele=i;
                cnt=1;
            }else if(ele == i){
                cnt++;
            }else{
                cnt--;
            }
        }
        cnt=0;
        for(int i: arr){
            if(ele==i){
                cnt++;
            }
        }
        if(cnt>(n/2)) return ele;
        return -1;
    }
}
