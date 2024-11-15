//method = use inbuilt ds
//this is not optimized code becouse of two ds to find result
class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> temp = new ArrayList<>(); //arrlst for n no. of occurance
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){ 
                temp.add(i);
            }
        }
        if(temp.size()==0){ //if arrlst is empty then return -1 as result
            temp.add(-1);
            temp.add(-1);
            return temp;
        }
        ArrayList<Integer> res =new ArrayList<>(); //arrlst for result
        res.add(temp.get(0)); //fist occurance
        res.add(temp.get(temp.size()-1)); //last occurance
        return res; //return result
    }
}
