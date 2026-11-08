class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> res = new ArrayList<>();
        if(s1.equals(s2)) return res;
        int n = s1.length();
        // StringBuilder mm1 = new StringBuilder();
        // StringBuilder mm2 = new StringBuilder();
        String mm1 = new String("");
        String mm2 = new String("");
        for(int i=0; i<n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                // mm1.append(s1.charAt(i));
                // mm2.append(s2.charAt(i));
                mm1 = mm1+s1.charAt(i);
                mm2 = mm2+s2.charAt(i);
            }else{
                if(mm1.length() > 0) {
                    ArrayList temp = new ArrayList<>();
                    temp.add(mm1);
                    temp.add(mm2);
                    res.add(temp);
                    // mm1 = new StringBuilder();
                    // mm2 = new StringBuilder();
                    mm1 = new String("");
                    mm2 = new String("");
                }
            }
        }
        if(mm1.length() > 0) {
            ArrayList temp = new ArrayList<>();
            temp.add(mm1);
            temp.add(mm2);
            res.add(temp);
                    // mm1 = new StringBuilder();
                    // mm2 = new StringBuilder();
            mm1 = new String("");   
            mm2 = new String("");
        }
        return res;
    }
}
