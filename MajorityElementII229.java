//method = Boyer Moores voting alogo
//optimiezed solution
//T O(n) 
// S O(1)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n1=0,n2=0,cnt1=0,cnt2=0,n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        if(nums.length == 0){
            return new ArrayList<>();
        }
        for(int ele: nums){
            if(ele == n1){ cnt1++; }
            else if(ele == n2){ cnt2++; }
            else if(0 == cnt1){ 
                n1=ele;
                cnt1++; 
            }
            else if(0 == cnt2){ 
                n2=ele;
                cnt2++; 
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i: nums){
            if(i == n1){ cnt1++; }
            if(i == n2){ cnt2++; }
        }
        if(cnt1 > (n/3)){ set.add(n1); }
        if(cnt2 > (n/3)){ set.add(n2); }
        return new ArrayList<>(set);
        
    }
}
