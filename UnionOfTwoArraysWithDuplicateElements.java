//method = use inbuilt ds
class Solution {
    public static int findUnion(int a[], int b[]) {
        Set<Integer> res = new HashSet<>();
        //store uniue elements using set
        for(Integer num: a){ 
            res.add(num);
        }
        for(Integer num: b){
            res.add(num);
        }
        return res.size(); //return size of set 
    }
}
