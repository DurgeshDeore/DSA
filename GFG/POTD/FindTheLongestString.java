class Solution {
    public String longestString(String[] arr) {
        HashSet<String>  set = new HashSet<>(Arrays.asList(arr));
        Arrays.sort(arr, (a,b) -> {
            if(b.length() != a.length()) return b.length() - a.length();
            return a.compareTo(b);
        });
        for(String w: arr){
            boolean isPrifix = true;
            for(int i=1; i<w.length(); i++){
                if(!set.contains(w.substring(0,i))){
                    isPrifix = false;
                    break;
                }
            }
            if(isPrifix) return w;
        }
        return "";
    }
}
