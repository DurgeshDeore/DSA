//method = use inbuilt ds
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> res = new TreeSet<>();
        for(int i=0; i<a.length; i++){
            res.add(a[i]);
        }
        for(int j=0; j<b.length; j++){
            res.add(b[j]);
        }
        return new ArrayList<>(res); //return arrlst as res
    }
}
