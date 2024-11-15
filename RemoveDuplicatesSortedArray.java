//method = use inbuilt ds
class Solution {
    // Function to remove duplicates from the given array
    public int remove_duplicate(List<Integer> arr) {
        Set<Integer> res= new LinkedHashSet<>(arr); //for unique elements
        arr.clear(); //clear original arr and store unique elements
        arr.addAll(res);
        return arr.size(); //return size
    }
}
