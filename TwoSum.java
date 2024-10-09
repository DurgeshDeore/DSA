//two sum problem
//time complexity O(n)
//space complexity O(1)
  public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans=new ArrayList<>();
        int lp=0,rp=n-1;
        if( n == 0 || n == 1){
            ans.add(-1);
            return ans; //if arr is empty
        }
        
        while(lp != rp){
            if( arr[lp] + arr[rp] == s){
                ans.add(arr[lp]);
                ans.add(arr[rp]);
                return ans;
            }
            //if it is greater
            if( arr[lp] + arr[lp] > s && arr[lp] > arr[rp]){
                lp++;
            }
            if( arr[lp] + arr[lp] > s && arr[lp] < arr[rp]){
                rp--;
            }
            //if smaller
            if( arr[lp] + arr[lp] < s && arr[lp] < arr[rp]){
                lp++;
            }
            if( arr[lp] + arr[lp] < s && arr[lp] > arr[rp]){
                rp--;
            }
            //
            if( arr[lp] + arr[lp] == s){
                ans.add(arr[lp]);
                ans.add(arr[lp]);
                return ans;
            }
            if(arr[rp] + arr[rp] == s){
                ans.add(arr[rp]);
                ans.add(arr[rp]);
                return ans;
            }
        }
        return ans;
    }
