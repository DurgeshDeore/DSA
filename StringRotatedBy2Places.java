class Solution {
    // there is simple method using substring() method which reduce code 
    public static boolean isRotated(String s1, String s2) {
        if(s1.equals(s2) || s2.length() < 2){
            return false;
        }
        int n = s1.length();
        StringBuffer rStr1 = new StringBuffer("");
        StringBuffer rStr2 = new StringBuffer("");
        
        for(int i=2; i<n; i++){
            rStr1.append(s1.charAt(i));
        }
        rStr1.append(s1.charAt(0));
        rStr1.append(s1.charAt(1));
        
        rStr2.append(s1.charAt(n-2));
        rStr2.append(s1.charAt(n-1));
        for(int i=0; i<n-2; i++){
            rStr2.append(s1.charAt(i));
        }
        
        
        String ans1 = rStr1.toString();
        String ans2 = rStr2.toString();
        if(ans1.equals(s2) || ans2.equals(s2)){
            return true;
        }
        return false;
    }
}
