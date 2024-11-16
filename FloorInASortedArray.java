//method = two varibles
class Solution {

    static int findFloor(int[] arr, int k) {
        int currDist=0,dist=Integer.MAX_VALUE,res=-1; //default if floor not found
        for(int i=0;i<arr.length;i++){
            currDist = k-arr[i];
            if(currDist>=0){
                dist=dist>currDist?currDist:dist; //find min dist
                res=i; //store i value as result
            }
        }
        return res; //return res
    }
}
