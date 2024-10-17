//Find the smallest and second smallest element

public int[] minAnd2ndMin(int arr[]) {
        int ans[] = new int[2];
        int small=Integer.MAX_VALUE, ssmall=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(small > arr[i]){
                ssmall = small;
                small = arr[i];
            }else if(arr[i] < ssmall && arr[i] > small){
                ssmall = arr[i];
            }
        }
        if(small == ssmall || small==Integer.MAX_VALUE || ssmall==Integer.MAX_VALUE){
            ans[0]=-1;
            return ans;
        }
        ans[0] = small;
        ans[1] = ssmall;
        return ans;
    }
