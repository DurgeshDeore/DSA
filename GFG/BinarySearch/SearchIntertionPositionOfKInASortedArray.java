class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        int l=0,r=N-1,res=N;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(k<=Arr[mid]){
                res=mid;
                r=mid-1;
            }else if(k<Arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}
