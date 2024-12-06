//method = boyers moores voating algorithm
//optomized solution
class Solution {
    public List<Integer> findMajority(int[] nums) {
        int n=nums.length;
        int n1=0,n2=0,cnt1=0,cnt2=0;
        Set<Integer> res = new TreeSet<>();
        for(int ele: nums){
            if(ele == n1){
                cnt1++;
            }else if(ele == n2){
                cnt2++;
            }else if(cnt1 == 0){
                n1=ele;
                cnt1++;
            }else if(cnt2 == 0){
                n2=ele;
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int ele: nums){
            if(ele == n1){ cnt1++; }
            if(ele == n2){ cnt2++; }
        }
        if(cnt1 > (n/3)){ res.add(n1); }
        if(cnt2 > (n/3)){ res.add(n2); }
        return new ArrayList<>(res);
    }
}
