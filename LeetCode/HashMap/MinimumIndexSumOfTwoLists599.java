// 94.84%
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE, n=list1.length, m=list2.length;
        List<String> temp=new ArrayList<>();

        for(int i=0; i<n; i++){
            map.put(list1[i],i);
        }
        
        for(int i=0; i<m; i++){
            if(map.containsKey(list2[i])){
                int indxSum = i+ map.get(list2[i]);
                // map.put(list2[i], indxSum);
                if(min > indxSum){
                    min=indxSum;
                    temp.clear();
                    temp.add(list2[i]);
                }else if(min == indxSum){
                    temp.add(list2[i]);
                }
            }
        }
        
        return temp.toArray(new String[0]);
    }
}
