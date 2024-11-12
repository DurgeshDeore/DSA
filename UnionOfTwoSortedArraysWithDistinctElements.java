//method = use inbuilt ds
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> res= new TreeSet<>(); //use tree set its slow but store element in sorted manner
        for(int i=0;i<a.length; i++){ 
            res.add(a[i]);  //add first arr in res
        }
        for(int j=0;j<b.length;j++){
            res.add(b[j]); //add second arr in res
        }
        return new ArrayList<>(res); //return res
    }
}
